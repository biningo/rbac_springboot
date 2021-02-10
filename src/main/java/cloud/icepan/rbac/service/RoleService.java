package cloud.icepan.rbac.service;

import cloud.icepan.rbac.dao.RoleMapper;
import cloud.icepan.rbac.model.Api;
import cloud.icepan.rbac.model.Role;
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
public class RoleService implements BaseService<Role> {
    @Resource
    RoleMapper roleMapper;

    @Override
    public int create(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int deleteById(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByAnd(Role role) {
        return roleMapper.deleteByAnd(role);
    }

    @Override
    public int deleteByOr(Role role) {
        return roleMapper.deleteByOr(role);
    }

    @Override
    public List<Role> getAll() {
        return roleMapper.selectAll();
    }

    @Override
    public List<Role> getByAnd(Role role) {
        return roleMapper.selectByAnd(role);
    }

    @Override
    public List<Role> getByOr(Role role) {
        return roleMapper.selectByOr(role);
    }

    @Override
    public Role getById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }
}
