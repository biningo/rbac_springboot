package cloud.icepan.rbac.service;

import cloud.icepan.rbac.dao.ApiMapper;
import cloud.icepan.rbac.model.Api;
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
public class ApiService implements BaseService<Api> {
    @Resource
    ApiMapper apiMapper;

    @Override
    public int create(Api entry) {
        if (entry.getCreateTime() == null) {
            entry.setCreateTime(new Timestamp(System.currentTimeMillis()));
            entry.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        }
        return apiMapper.insert(entry);
    }

    @Override
    public int deleteById(Integer id) {
        return apiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByOr(Api api) {
        return apiMapper.deleteByOr(api);
    }

    @Override
    public int deleteByAnd(Api api) {
        return apiMapper.deleteByAnd(api);
    }


    @Override
    public List<Api> getAll() {
        return apiMapper.selectAll();
    }

    @Override
    public List<Api> getByAnd(Api api) {
        return apiMapper.selectByAnd(api);
    }

    @Override
    public List<Api> getByOr(Api api) {
        return apiMapper.selectByOr(api);
    }

    @Override
    public Api getById(Integer id) {
        return apiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(Api api) {
        return apiMapper.updateByPrimaryKeySelective(api);
    }
}
