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
public class UserService implements BaseService<User> {

    @Resource
    UserMapper userMapper;

    @Override
    public int create(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByAnd(User user) {
        return userMapper.deleteByAnd(user);
    }

    @Override
    public int deleteByOr(User user) {
        return userMapper.deleteByOr(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> getByAnd(User user) {
        return userMapper.selectByAnd(user);
    }

    @Override
    public List<User> getByOr(User user) {
        return userMapper.selectByOr(user);
    }

    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
