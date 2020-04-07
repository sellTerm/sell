package com.example.sell.utils;

import com.example.sell.VO.ResultVO;

/**
 * ClassName: ResultUtils
 * Description:
 * date: 2020/4/6 14:50
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
public class ResultUtils {

    //成功返回对象
    public static ResultVO success(Object object){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setStatus(200);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return  resultVO;
    }

    public static ResultVO success(){
        return  success(null);
    }


    //失败的返回对象
    public static ResultVO error(Integer code,String msg){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setStatus(code);
        resultVO.setMsg(msg);
        return  resultVO;
    }

}
