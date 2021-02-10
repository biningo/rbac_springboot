package cloud.icepan.rbac.controller;

import cloud.icepan.rbac.model.Api;
import cloud.icepan.rbac.service.ApiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/***
 *@Author lyer
 *@Date 2/9/21 14:14
 *@Description
 *
 ***/

@RestController
@RequestMapping("/admin/api")
public class ApiController {
    @Resource
    ApiService apiService;


    @PostMapping("/create")
    public int create(@RequestBody Api api) {
        return apiService.create(api);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return apiService.deleteById(id);
    }

    @DeleteMapping("/{flag}")
    public int delete(@PathVariable("flag") String flag, Api api) {
        if (flag.toLowerCase().equals("and")) {
            return apiService.deleteByAnd(api);
        }
        return apiService.deleteByOr(api);
    }

    @GetMapping("/all")
    public List<Api> getAll() {
        return apiService.getAll();
    }

    @GetMapping("/{flag}")
    public List<Api> get(Api api, @PathVariable("flag") String flag) {
        if (flag.toLowerCase().equals("and")) {
            return apiService.getByAnd(api);
        }
        return apiService.getByOr(api);
    }

    @GetMapping("/{id}")
    public Api getById(@PathVariable("id") Integer id) {
        return apiService.getById(id);
    }

    @PostMapping("/update")
    public int updateById(@RequestBody Api api) {
        return apiService.updateById(api);
    }
}
