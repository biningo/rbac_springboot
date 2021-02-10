package cloud.icepan.rbac.controller;

import cloud.icepan.rbac.model.Permission;
import cloud.icepan.rbac.service.PermissionService;
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
@RequestMapping("/admin/permission")
public class PermissionController {
    @Resource
    PermissionService permissionService;


    @PostMapping("/create")
    public int create(@RequestBody Permission permission) {
        return permissionService.create(permission);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return permissionService.deleteById(id);
    }

    @DeleteMapping("/{flag}")
    public int delete(@PathVariable("flag") String flag, Permission permission) {
        if (flag.toLowerCase().equals("and")) {
            return permissionService.deleteByAnd(permission);
        }
        return permissionService.deleteByOr(permission);
    }

    @GetMapping("/all")
    public List<Permission> getAll() {
        return permissionService.getAll();
    }

    @GetMapping("/{flag}")
    public List<Permission> get(Permission permission, @PathVariable("flag") String flag) {
        if (flag.toLowerCase().equals("and")) {
            return permissionService.getByAnd(permission);
        }
        return permissionService.getByOr(permission);
    }

    @GetMapping("/{id}")
    public Permission getById(@PathVariable("id") Integer id) {
        return permissionService.getById(id);
    }

    @PostMapping("/update")
    public int updateById(@RequestBody Permission permission) {
        return permissionService.updateById(permission);
    }

}
