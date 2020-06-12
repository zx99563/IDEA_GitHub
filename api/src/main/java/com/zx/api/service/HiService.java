package com.zx.api.service;

import com.zx.vo.ReturnValue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PROVIDER")
public interface HiService {

    @GetMapping("/hello233")
    public ReturnValue Hello233();


}
