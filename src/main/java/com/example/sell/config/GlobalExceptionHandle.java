package com.example.sell.config;

import com.example.sell.VO.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 使用@ControllerAdvice+@ExceptionHandler注解处理异常
 * 注解@ControllerAdvice方式只能处理控制器抛出的异常。此时请求已经进入控制器中。
 */
@ControllerAdvice
public class GlobalExceptionHandle {
    /**
     * java.lang.ArithmeticException
     * 该方法需要返回一个ModelAndView：目的是可以让我们封装异常信息以及视图的指定
     * 参数Exception e:会将产生异常对象注入到方法中
     */
    @ExceptionHandler(value={java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("error1");
        return mv;
    }

    /**
     * java.lang.NullPointerException
     * 该方法需要返回一个ModelAndView：目的是可以让我们封装异常信息以及视图的指定
     * 参数Exception e:会将产生异常对象注入到方法中
     */
    @ExceptionHandler(value={java.lang.NullPointerException.class})
    public ModelAndView nullPointerExceptionHandler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", e.toString());
        mv.setViewName("error2");
        return mv;
    }

    /**
     * java.lang.NullPointerException
     * 该方法需要返回一个ModelAndView：目的是可以让我们封装异常信息以及视图的指定
     * 参数Exception e:会将产生异常对象注入到方法中
     */
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public ResultVO<Object> ExceptionHandler(HttpServletRequest req, Exception e){
        ResultVO<Object> resultVO = new ResultVO<>();
        if (e instanceof ClassNotFoundException) {
            resultVO.setStatus(000);
            resultVO.setMsg("classNotFountException" + e.getMessage());
        }
        return resultVO;
    }
}
