package cloud.icepan.rbac.service;

import cloud.icepan.rbac.dao.PermissionMapper;
import cloud.icepan.rbac.model.Api;
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
public class PermissionService implements BaseService<Permission> {
    @Resource
    PermissionMapper permissionMapper;

    @Override
    public int create(Permission permission) {
        return permissionMapper.insert(permission);
    }

    @Override
    public int deleteById(Integer id) {
        return permissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByAnd(Permission permission) {
        return permissionMapper.deleteByAnd(permission);
    }

    @Override
    public int deleteByOr(Permission permission) {
        return permissionMapper.deleteByOr(permission);
    }

    @Override
    public List<Permission> getAll() {
        return permissionMapper.selectAll();
    }

    @Override
    public List<Permission> getByAnd(Permission permission) {
        return permissionMapper.selectByAnd(permission);
    }

    @Override
    public List<Permission> getByOr(Permission permission) {
        return permissionMapper.selectByOr(permission);
    }

    @Override
    public Permission getById(Integer id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Permission permission) {
        return permissionMapper.updateByPrimaryKeySelective(permission);
    }
}
