package cloud.icepan.rbac.controller;

import cloud.icepan.rbac.model.Role;
import cloud.icepan.rbac.service.RoleService;
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
@RequestMapping("/admin/role")
public class RoleController {
    @Resource
    RoleService roleService;

    @GetMapping("/all")
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @PostMapping("/create")
    public boolean createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }


    @DeleteMapping("/delete/{id}")
    public boolean deleteRoleById(@PathVariable("id") Integer id) {
        return roleService.deleteRole(id);
    }

    @PostMapping("/delete")
    public boolean deleteRole(@RequestBody Role role) {
        return roleService.deleteRole(role);
    }

}
