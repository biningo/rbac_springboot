package cloud.icepan.rbac.service;

import java.util.List;

/***
 *@Author lyer
 *@Date 2/10/21 17:44
 *@Description
 *
 ***/
public interface BaseService<T> {
    int create(T t);

    int deleteById(Integer id);

    int deleteByOr(T t);

    int deleteByAnd(T t);

    List<T> getAll();

    List<T> getByAnd(T t);

    List<T> getByOr(T t);

    T getById(Integer id);

    int updateById(T t);
}
