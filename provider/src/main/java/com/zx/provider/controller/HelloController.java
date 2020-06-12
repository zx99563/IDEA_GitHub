package com.zx.provider.controller;

import com.zx.vo.ReturnValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @GetMapping("/hello.do")
    public ReturnValue HelloTest() {
        return ReturnValue.setOK("测试成功");
    }

    @GetMapping("/hello233")
    public ReturnValue Hello233() {
        return ReturnValue.setOK("测试233");
    }

}
