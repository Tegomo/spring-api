package com.anuvis.net.springbootdemo.service;


import com.anuvis.net.springbootdemo.api.model.User;
import com.anuvis.net.springbootdemo.api.repository.UserRepository;
import com.anuvis.net.springbootdemo.service.interfaces.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    };

    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent())
            return null;
        return user;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
