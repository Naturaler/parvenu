package com.yrx.parvenu.income.worker.material;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrx.parvenu.core.dao.IndexOverviewMapper;
import com.yrx.parvenu.core.pojo.IndexOverview;
import com.yrx.parvenu.core.utility.RestfulUtil;
import com.yrx.parvenu.income.frame.Material;
import com.yrx.parvenu.income.worker.Hunter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by r.x on 2020/2/19.
 */
@Component
@Material(polling = true)
public class IndexList extends Hunter<String> {
    @Autowired
    private IndexOverviewMapper indexOverviewMapper;

    @Override
    protected String hunt() {
        return null;
    }

    @Override
    protected void storage(String s) {

    }

    public void spider() {
        for (int i = 1; i < 50; i++) {
            String url = "http://www.csindex.com.cn/zh-CN/indices/index?page=" + i + "&page_size=50&data_type=json";
            String result = RestfulUtil.get(url);
            JSONObject json = JSON.parseObject(result);
            JSONArray jsonArray = json.getJSONArray("list");
            if (jsonArray.size() > 0) {
                for (Object item : jsonArray) {
                    IndexOverview pojo = JSON.parseObject(item.toString(), IndexOverview.class);
                    indexOverviewMapper.insertSelective(pojo);
                }
            } else {
                return;
            }
        }
    }
}
