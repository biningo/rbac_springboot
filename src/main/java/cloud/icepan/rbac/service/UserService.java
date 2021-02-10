package cloud.icepan.rbac.service;

import cloud.icepan.rbac.dao.UserMapper;
import cloud.icepan.rbac.model.Api;
import cloud.icepan.rbac.model.User;
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
public class UserService {

    @Resource
    UserMapper userMapper;


    public boolean createUser(User user) {
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int flag = userMapper.insert(user);
        return flag > 0;
    }

    public boolean deleteUser(User user) {
        int flag = userMapper.delete(user);
        return flag > 0;
    }

    public boolean deleteUser(Integer id) {
        int flag = userMapper.deleteByPrimaryKey(id);
        return flag > 0;
    }

    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
