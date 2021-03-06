package com.github.mustfun.generator.service;

import com.github.mustfun.generator.model.po.DbSourcePo;

import java.util.List;

/**
 * Created by dengzhiyuan on 2017/4/6.
 */
public interface DbSourceService {
    DbSourcePo getOne(Integer id);

    Boolean saveDbConfig(DbSourcePo dbSourcePo);

    List<DbSourcePo> queryList();
}
