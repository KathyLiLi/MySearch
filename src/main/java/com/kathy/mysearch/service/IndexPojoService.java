package com.kathy.mysearch.service;

import com.kathy.mysearch.index.IndexPojo;
import com.kathy.mysearch.vo.ResultBean;

import java.util.List;

public interface IndexPojoService {

    //新增
    ResultBean save(IndexPojo pojo);

    //删除
    ResultBean del(int id);

    //查看全部
    List<IndexPojo> queryAll();

    //模糊查询
    List<IndexPojo> queryLike(String name);
}
