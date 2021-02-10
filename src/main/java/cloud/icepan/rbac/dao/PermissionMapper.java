package cloud.icepan.rbac.dao;

import cloud.icepan.rbac.model.Permission;
import org.apache.ibatis.annotations.Mapper;

/***
 *@Author lyer
 *@Date 2/9/21 14:02
 *@Description
 *
 ***/

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}
