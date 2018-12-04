package com.kathy.mysearch.dao;

import com.kathy.mysearch.index.IndexPojo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface IndexPojoDao extends ElasticsearchRepository<IndexPojo,Integer> {

    //方法名解析查询
    List<IndexPojo> getByNameLike(String name);
}
