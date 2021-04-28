package com.example.sell.config;

import com.example.sell.VO.ResultVO;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ErrorController方式可以处理所有的异常，包括未进入控制器的错误，比如404,401等错误
 */
@RestController
public class GlobalExceptionHandle2 implements ErrorController {
    // getErrorPath()返回的路径服务器将会重定向到该路径对应的处理类，本例中为error方法
    private final static String ERROR_PATH = "/error";

    @ResponseBody
    @RequestMapping(path = ERROR_PATH)
    public ResultVO error(HttpServletRequest request, HttpServletResponse response) {
        ResultVO result = new ResultVO(500, "HttpErrorController error:", null);
        return result;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}