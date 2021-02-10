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
public class ApiService {
    @Resource
    ApiMapper apiMapper;

    public boolean createApi(Api api) {
        api.setCreateTime(new Timestamp(System.currentTimeMillis()));
        api.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        int flag = apiMapper.insert(api);
        return flag > 0;
    }

    public boolean deleteApi(Api api) {
        int flag = apiMapper.delete(api);
        return flag > 0;
    }

    public boolean deleteApi(Integer id) {
        int flag = apiMapper.deleteByPrimaryKey(id);
        return flag > 0;
    }

    public List<Api> getAll() {
        return apiMapper.selectAll();
    }

    public Api getById(Integer id) {
        return apiMapper.selectByPrimaryKey(id);
    }


}
