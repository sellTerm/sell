package com.example.sell.domain.enums;

import lombok.Getter;

/**
 * ClassName: OrderStatusEnum
 * Description:
 * date: 2020/4/7 22:03
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"订单完成"),
    CANCAL(2,"订单已取消");

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
