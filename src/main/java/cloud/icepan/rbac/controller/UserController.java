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

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/create")
    public boolean createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @DeleteMapping("/delete/{id}")
    public boolean deleteUserById(@PathVariable("id") Integer id) {
        return userService.deleteUser(id);
    }

    @PostMapping("/delete")
    public boolean deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }


}
