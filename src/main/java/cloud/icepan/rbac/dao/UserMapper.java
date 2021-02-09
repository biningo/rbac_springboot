package cloud.icepan.rbac.dao;

import cloud.icepan.rbac.model.Api;
import cloud.icepan.rbac.model.User;
import org.apache.ibatis.annotations.Mapper;

/***
 *@Author lyer
 *@Date 2/9/21 13:59
 *@Description
 *
 ***/

@Mapper
public interface UserMapper extends BaseMapper<User> {
    int insert(User user);

    int delete(User user);
}
