package cloud.icepan.rbac.service;

import cloud.icepan.rbac.dao.PermissionMapper;
import cloud.icepan.rbac.model.Permission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/***
 *@Author lyer
 *@Date 2/9/21 14:13
 *@Description
 *
 ***/

@Service
public class PermissionService {
    @Resource
    PermissionMapper permissionMapper;
    public boolean createPermission(Permission permission) {
        permission.setCreateTime(new Timestamp(System.currentTimeMillis()));
        permission.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int flag = permissionMapper.insert(permission);
        return flag > 0;
    }

    public boolean deletePermission(Permission permission) {
        int flag = permissionMapper.delete(permission);
        return flag > 0;
    }

    public boolean deletePermission(Integer id) {
        int flag = permissionMapper.deleteByPrimaryKey(id);
        return flag > 0;
    }

    public List<Permission> getAll() {
        return permissionMapper.selectAll();
    }
}
