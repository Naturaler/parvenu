package com.yrx.parvenu.income.frame;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by r.x on 2020/2/19.
 */
@AllArgsConstructor
@Getter
public enum StorageProtocol {
    MySql("MySql"),
    Mongo("Mongo"),
    ;

    private String name;
}
