package com.kai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kai
 * @Date: Created in 下午 06:12 2018/11/16
 */
@Controller
public class PageController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","friend ");
        List<String> stringList= new ArrayList<>();
        stringList.add("test0");
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");

        model.addAttribute("list",stringList);
        return "index";
    }
}
