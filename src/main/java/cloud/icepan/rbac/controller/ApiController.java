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

    @GetMapping("/all")
    public List<Api> getAll() {
        return apiService.getAll();
    }

    @PostMapping("/create")
    public boolean createApi(@RequestBody Api api) {
        return apiService.createApi(api);
    }


    @DeleteMapping("/delete/{id}")
    public boolean deleteApiById(@PathVariable("id") Integer id) {
        return apiService.deleteApi(id);
    }

    @PostMapping("/delete")
    public boolean deleteApi(@RequestBody Api api) {
        return apiService.deleteApi(api);
    }

}
