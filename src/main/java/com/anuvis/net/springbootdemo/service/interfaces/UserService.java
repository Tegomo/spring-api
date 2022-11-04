package com.anuvis.net.springbootdemo.service.interfaces;

import com.anuvis.net.springbootdemo.api.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public interface UserService {
    List<User> userList();
    Optional<User> findUser(Long id);

    User save(User user);
}
