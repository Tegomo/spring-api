package com.anuvis.net.springbootdemo.controllers.api;

import com.anuvis.net.springbootdemo.controllers.interfaces.UserController;
import com.anuvis.net.springbootdemo.models.entities.User;
import com.anuvis.net.springbootdemo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserApi implements UserController {

    private UserService userService;

    @Autowired
    UserApi(UserService userService){
        this.userService = userService;
    };

    @Override
    public List<User> userList() {
        return userService.userList();
    }

    @Override
    public Optional<User> findUser(Long id) {
        return userService.findUser(id);
    }

    @Override
    public User save(User user) {
        return userService.save(user);
    }
}
