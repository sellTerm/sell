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
public enum PayStatusEnum {
    WAITING(0,"等待支付"),
    SUCCESS(1,"成功支付");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
