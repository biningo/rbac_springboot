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

    @GetMapping("/all")
    public List<Permission> getAll() {
        return permissionService.getAll();
    }

    @PostMapping("/create")
    public boolean createPermission(@RequestBody Permission permission) {
        return permissionService.createPermission(permission);
    }


    @DeleteMapping("/delete/{id}")
    public boolean deletePermissionById(@PathVariable("id") Integer id) {
        return permissionService.deletePermission(id);
    }

    @PostMapping("/delete")
    public boolean deletePermission(@RequestBody Permission permission) {
        return permissionService.deletePermission(permission);
    }

}
