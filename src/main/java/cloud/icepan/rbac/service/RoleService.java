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
public class RoleService {
    @Resource
    RoleMapper roleMapper;

    public boolean createRole(Role role) {
        role.setCreateTime(new Timestamp(System.currentTimeMillis()));
        role.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int flag = roleMapper.insert(role);
        return flag > 0;
    }

    public boolean deleteRole(Role role) {
        int flag = roleMapper.delete(role);
        return flag > 0;
    }

    public boolean deleteRole(Integer id) {
        int flag = roleMapper.deleteByPrimaryKey(id);
        return flag > 0;
    }

    public List<Role> getAll() {
        return roleMapper.selectAll();
    }

    public Role getById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }
}
