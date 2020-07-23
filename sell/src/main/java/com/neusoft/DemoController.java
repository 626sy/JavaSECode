package com.neusoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shihaobo
 * @date 2020/6/22 18:56
 */
@RestController
public class DemoController {
    @GetMapping("/index")
    public String index(){
        return "hello SpringBoot";
    }
}
