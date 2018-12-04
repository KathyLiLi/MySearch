package com.kathy.mysearch.serviceimpl;

import com.kathy.mysearch.dao.IndexPojoDao;
import com.kathy.mysearch.index.IndexPojo;
import com.kathy.mysearch.service.IndexPojoService;
import com.kathy.mysearch.util.ResultUtil;
import com.kathy.mysearch.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class IndexPojoServiceImpl implements IndexPojoService {

    @Autowired
    private IndexPojoDao dao;

    @Override
    public ResultBean save(IndexPojo pojo) {

        if (dao.save(pojo)!=null) {
            return ResultUtil.setOK("新增索引数据成功",null);
        } else {
            return ResultUtil.setError(100002,"新增索引失败",null);
        }

    }

    @Override
    public ResultBean del(int id) {

        dao.deleteById(id);
        return ResultUtil.setOK("删除索引数据成功",null);
    }

    @Override
    public List<IndexPojo> queryAll() {

        Iterator<IndexPojo> indexPojos = dao.findAll().iterator();
        List<IndexPojo> pojos = new ArrayList<>();
        while (indexPojos.hasNext()) {
            pojos.add(indexPojos.next());
        }
        return pojos;
    }

    @Override
    public List<IndexPojo> queryLike(String name) {

        return dao.getByNameLike(name);
    }
}
