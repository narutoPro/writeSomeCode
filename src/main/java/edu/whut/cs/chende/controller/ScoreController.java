package edu.whut.cs.chende.controller;


import edu.whut.cs.chende.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.util.Date;

@Controller
public class ScoreController {

    @Autowired
    TestService testService;
    @RequestMapping("/")
    @ResponseBody
    public String home() {
   //     testService.test();
        return "home";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        testService.test();
        return "success";
    }
    @RequestMapping("/threadtest")
    @ResponseBody
    public String test2(int totalPage,int pageSize ) {
        System.out.println(totalPage+"   "+pageSize);
        System.out.println("method Start:"+new Date(System.currentTimeMillis()));
        testService.test2(totalPage,pageSize);
        System.out.println("method end:"+new Date(System.currentTimeMillis()));
        return " threadtest success";
    }
}
