package com.yrx.parvenu.income;

import com.yrx.parvenu.income.worker.Hunter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by r.x on 2020/2/20.
 */
@Component
public class Rooster {
    @Autowired
    private Henhome henhome;

    @Scheduled(cron = "")
    public void crow() {
        List<Hunter> jobs = henhome.listJob();
        for (Hunter job : jobs) {
            job.doWork();
        }
    }
}
