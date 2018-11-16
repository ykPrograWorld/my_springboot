package com.kai.exception;

/**
 * @Author: kai
 * @Date: Created in 下午 05:00 2018/11/16
 */
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//加上该注释，捕获controller层异常
@ControllerAdvice
public class ExceptionAop {
    /**
     * 捕获运行时异常
     */
//   捕获的异常类
    @ExceptionHandler(RuntimeException.class)
//   捕获后返回信息
    @ResponseBody
    public String runtimeExcep(){
        return "捕获controller层异常";
    }
}
