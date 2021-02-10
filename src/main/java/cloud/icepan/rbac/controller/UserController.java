package cloud.icepan.rbac.controller;

import cloud.icepan.rbac.model.User;
import cloud.icepan.rbac.service.UserService;
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
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    UserService userService;



    @PostMapping("/create")
    public int create(@RequestBody User user) {
        return userService.create(user);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable("id") Integer id) {
        return userService.deleteById(id);
    }

    @DeleteMapping("/{flag}")
    public int delete(@PathVariable("flag") String flag, User user) {
        if (flag.toLowerCase().equals("and")) {
            return userService.deleteByAnd(user);
        }
        return userService.deleteByOr(user);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{flag}")
    public List<User> get(User user, @PathVariable("flag") String flag) {
        if (flag.toLowerCase().equals("and")) {
            return userService.getByAnd(user);
        }
        return userService.getByOr(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    @PostMapping("/update")
    public int updateById(@RequestBody User user) {
        return userService.updateById(user);
    }
}
