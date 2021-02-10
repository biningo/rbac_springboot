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


    @PostMapping("/create")
    public int create(@RequestBody Role role) {
        return roleService.create(role);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return roleService.deleteById(id);
    }

    @DeleteMapping("/{flag}")
    public int delete(@PathVariable("flag") String flag, Role role) {
        if (flag.toLowerCase().equals("and")) {
            return roleService.deleteByAnd(role);
        }
        return roleService.deleteByOr(role);
    }

    @GetMapping("/all")
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{flag}")
    public List<Role> get(Role role, @PathVariable("flag") String flag) {
        if (flag.toLowerCase().equals("and")) {
            return roleService.getByAnd(role);
        }
        return roleService.getByOr(role);
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable("id") Integer id) {
        return roleService.getById(id);
    }

    @PostMapping("/update")
    public int updateById(@RequestBody Role role) {
        return roleService.updateById(role);
    }
}
