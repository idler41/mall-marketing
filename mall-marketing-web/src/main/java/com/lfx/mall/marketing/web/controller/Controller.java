package com.lfx.mall.marketing.web.controller;

import com.lfx.mall.marketing.service.ActTaskGroupService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 19:16:33
 */
@RestController
@RequestMapping("/prize")
public class Controller {

    @Reference
    private ActTaskGroupService actTaskGroupService;


    @GetMapping("/get")
    public void sayHello() {
        System.out.println("getHello");
    }

}
