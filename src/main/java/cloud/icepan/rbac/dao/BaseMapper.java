package cloud.icepan.rbac.dao;

import cloud.icepan.rbac.model.Api;

import java.util.List;

/***
 *@Author lyer
 *@Date 2/9/21 14:03
 *@Description
 *
 ***/


interface BaseMapper<T> {
    int deleteByPrimaryKey(Integer id);

    List<T> selectAll();

    T selectByPrimaryKey(Integer id);

    int insert(T entry);

    int delete(T entry);
}
