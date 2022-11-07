package com.anuvis.net.springbootdemo.controllers.interfaces;

import com.anuvis.net.springbootdemo.models.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping( "api/v1/user")
public interface UserController {
    @GetMapping("/all")
    List<User> userList();

    @GetMapping("/{id}")
    Optional<User> findUser(@PathVariable Long id);

    @PostMapping("/new")
    User save(@RequestBody User user);
}
