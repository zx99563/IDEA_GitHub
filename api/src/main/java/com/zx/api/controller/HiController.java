package com.zx.api.controller;

import com.zx.api.service.HiService;
import com.zx.vo.ReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hiAPI")
    public ReturnValue rv () {
        return  hiService.Hello233();
    }

}
