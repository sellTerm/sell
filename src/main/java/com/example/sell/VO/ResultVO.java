package com.example.sell.VO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
/*响应类*/
@Data
public class ResultVO<T> {

    @JsonProperty("code")
    private Integer status;//状态
    @JsonProperty("msg")
    private String msg;//信息
    @JsonProperty("data")
    private T data;//数据
}
