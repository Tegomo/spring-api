package com.anuvis.net.springbootdemo.api.repository;

import com.anuvis.net.springbootdemo.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
