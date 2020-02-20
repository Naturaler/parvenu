package com.yrx.parvenu.income.frame;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by r.x on 2020/2/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Material {

    RequestProtocol requestProtocol() default RequestProtocol.GET;

    /**
     * 超时时长：分钟
     */
    int timeout() default 3;
    DataProtocol dataProtocol() default DataProtocol.JSON;

    boolean polling() default false;
    StorageProtocol storageProtocol() default StorageProtocol.Mongo;



}
