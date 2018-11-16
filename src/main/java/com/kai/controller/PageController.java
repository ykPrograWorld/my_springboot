package com.kai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: kai
 * @Date: Created in 下午 06:12 2018/11/16
 */
@Controller
public class PageController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","friend ");
        return "index";
    }
}
