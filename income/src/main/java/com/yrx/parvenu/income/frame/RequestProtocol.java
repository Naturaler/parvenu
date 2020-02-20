package com.yrx.parvenu.income.frame;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by r.x on 2020/2/20.
 */
@AllArgsConstructor
@Getter
public enum RequestProtocol {
    GET("get"),
    POST("post"),
    ;

    private String name;
}
