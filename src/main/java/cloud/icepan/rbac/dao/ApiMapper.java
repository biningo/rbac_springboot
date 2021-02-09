package cloud.icepan.rbac.dao;

import cloud.icepan.rbac.model.Api;
import org.apache.ibatis.annotations.Mapper;

/***
 *@Author lyer
 *@Date 2/9/21 14:01
 *@Description
 *
 ***/

@Mapper
public interface ApiMapper extends BaseMapper<Api> {
    int insert(Api api);

    int delete(Api api);

}
