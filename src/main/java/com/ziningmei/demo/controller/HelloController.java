package com.ziningmei.demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller("/hello")
public class HelloController {

    @RequestMapping(value = "/{name}")
    public ModelAndView forward(@PathVariable("name") String name) {
        return new ModelAndView(String.valueOf(name));
    }

    @RequestMapping(value = "/helloworld", method = RequestMethod.POST)
    @ResponseBody
    public String getCEQTransferReportList() {
        String hello="Hello world1234567890";
        return JSON.toJSONString(hello);
    }

    @RequestMapping(value = "/helloworld1", method = RequestMethod.POST)
    @ResponseBody
    public String getCEQTransferReportList1() {
        String hello="Hello world1";
        return JSON.toJSONString(hello);
    }

}
