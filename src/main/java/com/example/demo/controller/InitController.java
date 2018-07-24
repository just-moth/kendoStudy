package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： lxh
 * @description：
 * @created: 2018/6/1 11:40
 * @modified by:
 */
@RestController
@RequestMapping("/zpage/init")
public class InitController {

    @GetMapping("/datasource")
    public List get(){
        List<String> lists = new ArrayList<>();
        lists.add("one");
        lists.add("two");
        return lists;
    }
}
