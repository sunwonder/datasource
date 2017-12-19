package com.jason.learning.datasource.mapper;

import com.jason.learning.datasource.annotation.RepositoryOne;
import com.jason.learning.datasource.entity.Admin;
import tk.mybatis.mapper.common.Mapper;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2017-12-14 下午11:25
 **/
@RepositoryOne
public interface AdminMapper extends Mapper<Admin> {

}
