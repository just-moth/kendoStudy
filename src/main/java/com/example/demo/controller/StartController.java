package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： lxh
 * @description：
 * @created: 2018/6/1 10:18
 * @modified by:
 */
@RestController
@RequestMapping("/start")
public class StartController {

    @GetMapping("/dateviz/pointer")
    public Integer index(){
        return 120;
    }

}
