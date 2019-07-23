package study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import study.form.UserAddForm;
import study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujunliang
 * @date 2019/6/28
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("count")
    public Integer getUserCount(){
        return userService.getUserCount();
    }

    @PostMapping("add")
    public Integer addUser(UserAddForm form){
        return userService.add(form);
    }
}
