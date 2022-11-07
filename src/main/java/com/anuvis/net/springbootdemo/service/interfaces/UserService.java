package com.anuvis.net.springbootdemo.service.interfaces;

import com.anuvis.net.springbootdemo.models.entities.User;

import java.util.List;
import java.util.Optional;



public interface UserService {
    List<User> userList();
    Optional<User> findUser(Long id);

    User save(User user);
}
