package com.lfx.mall.marketing.persistence.algorithm.hash;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import lombok.Getter;

import java.util.SortedMap;
import java.util.TreeMap;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-20 09:55:38
 */
public class StringConsistentHashCoding implements HashCoding<String> {
    @Getter
    private int realNodeCount;
    @Getter
    private int virtualNodeCount;

    @SuppressWarnings("UnstableApiUsage")
    private final HashFunction hash;

    private final SortedMap<Integer, Integer> bucketMap;

    public StringConsistentHashCoding(int realNodeCount, int virtualNodeCount) {
        checkArgument(
                realNodeCount > 0 && virtualNodeCount > 0,
                "realNodeCount or virtualNodeCount must be positive: realNodeCount=%s virtualNodeCount=%s",
                realNodeCount, virtualNodeCount
        );

        this.realNodeCount = realNodeCount;
        this.virtualNodeCount = virtualNodeCount;
        //noinspection UnstableApiUsage
        this.hash = Hashing.murmur3_32();
        this.bucketMap = new TreeMap<>();

        String virtualNodeNameFormat = "virtual-%s-node-%s";
        for (int i = 0; i < virtualNodeCount; i++) {
            for (int j = 0; j < realNodeCount; j++) {
                String virtualNodeName = String.format(virtualNodeNameFormat, i, j);
                this.bucketMap.put(this.hash.hashUnencodedChars(virtualNodeName).asInt(), j);
            }
        }
    }

    @Override
    public int hashFor(String v) {
        SortedMap<Integer, Integer> tail = bucketMap.tailMap(hash.hashUnencodedChars(v).asInt());
        return tail.isEmpty() ? bucketMap.get(bucketMap.firstKey()) : tail.get(tail.firstKey());
    }

//    public static void main(String[] args) throws Exception {
//        StringConsistentHashCoding hashCoding = new StringConsistentHashCoding(32, 64);
//        int count = 100000;
//        Map<String, LongAdder> map = new HashMap<>();
//        for (int i = 0; i < 32; i++) {
//            map.put(Integer.toString(i), new LongAdder());
//        }
//        Stopwatch stopwatch = Stopwatch.createUnstarted();
//        for (int i = 0; i < count; i++) {
//            stopwatch.reset();
//            stopwatch.start();
//            int v = hashCoding.hashFor(Integer.toString(i));
//
//            LongAdder longAdder = map.get(Integer.toString(v));
//            System.out.println(stopwatch.stop());
//            longAdder.increment();
//        }
//
//        long c = 0;
//        for (Map.Entry<String, LongAdder> entry : map.entrySet()) {
//            System.out.println(String.format("%s=%s", entry.getKey(), entry.getValue().longValue()));
//            c += entry.getValue().longValue();
//        }
//        System.out.println(c);
//    }
}
