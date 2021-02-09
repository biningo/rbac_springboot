package cloud.icepan.rbac.dao;

import cloud.icepan.rbac.model.Api;
import cloud.icepan.rbac.model.Role;
import org.apache.ibatis.annotations.Mapper;

/***
 *@Author lyer
 *@Date 2/9/21 14:02
 *@Description
 *
 ***/

@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    int insert(Role role);

    int delete(Role role);
}
