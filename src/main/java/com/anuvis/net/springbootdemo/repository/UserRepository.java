package com.anuvis.net.springbootdemo.repository;

import com.anuvis.net.springbootdemo.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
