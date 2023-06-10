package com.graphql.test.service;

import java.util.List;
import java.util.Optional;

import com.graphql.test.entity.User;

public interface UserService {
    List<User> findAll(int page,int pageSize);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    void save(User user);
    void deleteById(Long id);
}


