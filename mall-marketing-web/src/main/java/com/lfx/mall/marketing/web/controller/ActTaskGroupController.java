package com.lfx.mall.marketing.web.controller;

import com.lfx.mall.marketing.service.ActTaskGroupService;
import com.lfx.mall.marketing.service.base.request.IdRequest;
import com.lfx.mall.marketing.web.request.ActTaskGroupWebRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 19:16:33
 */
@RestController
@RequestMapping("/act/task-group")
@Slf4j
public class ActTaskGroupController {

    @Reference
    private ActTaskGroupService actTaskGroupService;


    @GetMapping("/get")
    public void sayHello(@Valid @NotNull Integer id) {
        actTaskGroupService.get(IdRequest.of(id));
    }

    @PostMapping(value = "/submit", produces = MediaType.APPLICATION_JSON_VALUE)
    public void saySubmit(@Valid @RequestBody ActTaskGroupWebRequest request) {
        log.info("param:" + request);
    }

}
