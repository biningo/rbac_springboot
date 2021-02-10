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
    int insert(T entry);

    int deleteByPrimaryKey(Integer id);

    int deleteByAnd(T entry);

    int deleteByOr(T entry);


    List<T> selectAll();

    List<T> selectByAnd(T entry);

    List<T> selectByOr(T entry);


    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T entry);
}
