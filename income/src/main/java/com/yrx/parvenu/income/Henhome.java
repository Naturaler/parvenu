package com.yrx.parvenu.income;

import com.yrx.parvenu.income.frame.Material;
import com.yrx.parvenu.income.worker.Hunter;
import com.yrx.parvenu.income.worker.material.IndexList;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Created by r.x on 2020/2/20.
 */
@Component
public class Henhome {

    public List<Hunter> listJob() {
        Material material = IndexList.class.getAnnotation(Material.class);

        return Collections.emptyList();
    }
}
