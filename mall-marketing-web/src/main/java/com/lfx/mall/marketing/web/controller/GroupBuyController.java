package com.lfx.mall.marketing.web.controller;

import com.lfx.mall.marketing.service.base.response.Response;
import com.lfx.mall.marketing.service.base.util.ResponseUtil;
import com.lfx.mall.marketing.web.request.SpuGroupQueryWebRequest;
import com.lfx.mall.marketing.web.response.GroupInfoWebResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-09-03 09:49:55
 */
@RestController
@RequestMapping("/act/group-buy")
@Slf4j
public class GroupBuyController {

    @GetMapping("/list")
    public Response<List<GroupInfoWebResponse>> groupList(SpuGroupQueryWebRequest request) {
        // 1. 查询拼团列表
        return ResponseUtil.success(null);
    }

    @PostMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<Boolean> submitGroupOrder() {
        // 1. 用户拼团资格校验

        // 2. 创建订单编号

        // 3. 添加拼团信息

        // 4. 添加订单信息
        return ResponseUtil.success(true);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("CREATE TABLE `t_group_buy_"+i+"` (\n" +
                    "`id` VARCHAR ( 32 ) NOT NULL COMMENT '开团id',\n" +
                    "`parent_id` VARCHAR ( 32 ) DEFAULT '' COMMENT '原始拼团id',\n" +
                    "`act_id` INT ( 11 ) NOT NULL COMMENT '活动id',\n" +
                    "`act_spu_id` INT ( 11 ) NOT NULL COMMENT '活动商品id',\n" +
                    "`act_sku_id` INT ( 11 ) NOT NULL COMMENT '活动货品id',\n" +
                    "`spu_id` INT ( 11 ) NOT NULL COMMENT '商品id',\n" +
                    "`sku_id` INT ( 11 ) NOT NULL COMMENT '货品id',\n" +
                    "`spu_name` VARCHAR ( 255 ) DEFAULT NULL COMMENT '商品名称',\n" +
                    "`seller_id` INT ( 11 ) NOT NULL COMMENT '商家id',\n" +
                    "`seller_name` VARCHAR ( 32 ) NOT NULL COMMENT '商家名称',\n" +
                    "`price` BIGINT ( 20 ) NOT NULL COMMENT '购买单价',\n" +
                    "`number` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '购买数量',\n" +
                    "`leader_id` INT ( 11 ) NOT NULL COMMENT '团长用户id',\n" +
                    "`leader_nick_name` VARCHAR ( 50 ) NOT NULL COMMENT '团长昵称',\n" +
                    "`leader_avatar` VARCHAR ( 500 ) NOT NULL COMMENT '团长头像',\n" +
                    "`order_sn` VARCHAR ( 64 ) NOT NULL COMMENT '开团订单编号',\n" +
                    "`order_psn` VARCHAR ( 64 ) NOT NULL COMMENT '开团父订单编号',\n" +
                    "`red_packet_flag` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '红包标记: 0-没有红包 1-有红包',\n" +
                    "`group_type` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '团类型: 0-普通拼团 1-拼团赚',\n" +
                    "`group_status` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '团状态：0-待成团 1-已成团 2-已失效',\n" +
                    "`group_member_size` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团人数',\n" +
                    "`group_member_amount` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '已参团人数',\n" +
                    "`expire_time` datetime NOT NULL COMMENT '团过期时间',\n" +
                    "`start_time` datetime NOT NULL COMMENT '团开始时间',\n" +
                    "`finish_time` datetime DEFAULT NULL COMMENT '拼团完成时间',\n" +
                    "`robot_work_minutes` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团补齐机器人实际工作时间(单位分钟)',\n" +
                    "`robot_work_min_minutes` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团补齐机器人工作最小开始时间(单位分钟)',\n" +
                    "`robot_work_max_minutes` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团补齐机器人工作最大开始时间(单位分钟)',\n" +
                    "`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n" +
                    "`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',\n" +
                    "PRIMARY KEY ( `id` ),\n" +
                    "KEY `idx_order_sn` ( `order_sn` ),\n" +
                    "KEY `idx_leader_id` ( `leader_id` ) \n" +
                    ") ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '拼团-团信息表';\n" +
                    "\n" +
                    "CREATE TABLE `t_group_buy_member_"+i+"` (\n" +
                    "`id` VARCHAR ( 32 ) NOT NULL COMMENT '参团id',\n" +
                    "`group_id` INT ( 11 ) NOT NULL COMMENT '开团id',\n" +
                    "`member_id` INT ( 11 ) NOT NULL COMMENT '团成员用户id',\n" +
                    "`member_nick_name` VARCHAR ( 50 ) NOT NULL COMMENT '会员昵称',\n" +
                    "`member_avatar` VARCHAR ( 500 ) NOT NULL COMMENT '会员头像地址',\n" +
                    "`member_type` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '团成员类型：0-团长，1-普通成员',\n" +
                    "`order_sn` VARCHAR ( 64 ) NOT NULL COMMENT '订单编号',\n" +
                    "`order_psn` VARCHAR ( 64 ) NOT NULL COMMENT '订单父编号',\n" +
                    "`order_pay_time` datetime NOT NULL COMMENT '订单付款时间',\n" +
                    "`act_sku_id` INT ( 11 ) NOT NULL COMMENT '活动货品id',\n" +
                    "`price` BIGINT ( 20 ) NOT NULL COMMENT '购买单价',\n" +
                    "`number` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '购买数量',\n" +
                    "`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n" +
                    "`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',\n" +
                    "PRIMARY KEY ( `id` ),\n" +
                    "KEY `idx_group_id` ( `group_id` ),\n" +
                    "KEY `idx_order_sn` ( `order_sn` ),\n" +
                    "KEY `idx_member_id` ( `member_id` ) \n" +
                    ") ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '拼团-团成员记录表';");
        }
    }
}
