package com.kai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kai
 * @Date: Created in 下午 04:13 2018/11/16
 */
@RestController
//@EnableAutoConfiguration  加上之后可以在这启动  不建议使用
public class HelloController {
    @RequestMapping("hello")
   public String hello(){
       return "hello,kai";
   }

   @RequestMapping("excep")
   public String excep(){
       int a = 2/0;
       return "异常";
   }





    /**
     * 配合EnableAutoConfiguration启动
     */
//    public static void main(String[] args) {
//        SpringApplication.run(helloController.class, args);
//    }
}
