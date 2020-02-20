package com.yrx.parvenu.income.api;

import com.yrx.parvenu.income.worker.material.IndexList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by r.x on 2020/2/20.
 */
@RestController
@RequestMapping("/spider")
public class SpiderApi {
    @Autowired
    private IndexList indexList;

    @GetMapping("/indexOverview")
    public String spider() {
        try {
            indexList.spider();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
