package com.example.sell.domain;


import lombok.Data;
/*响应类*/
@Data
public class Response {
    private String status;//状态
    private String msg;//信息
    private Object data;//数据
}
