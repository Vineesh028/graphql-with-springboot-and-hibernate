package com.graphql.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.test.entity.User;
import com.graphql.test.service.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
    
    @QueryMapping
    public Optional<User> findById(@Argument Long id) {
        return userService.findById(id);
    }
    @QueryMapping
    public Optional<User> findByEmail(@Argument String email) {
        return userService.findByEmail(email);
    }
    @QueryMapping
    public List<User> findAll(@Argument int page, @Argument int pageSize) {
        return userService.findAll(page, pageSize);
    }
    @MutationMapping
    public User createUser(@Argument String name,@Argument String nickName, @Argument String email){
        User user = User.builder().name(name).nickName(nickName).email(email).build();
        userService.save(user);
        return user;
    }
    @MutationMapping
    public User updateUser(@Argument Long id,@Argument String name,@Argument String nickName, @Argument String email){
        User user = User.builder().id(id).name(name).nickName(nickName).email(email).build();
        userService.save(user);
        return user;
    }
    @MutationMapping
    public Boolean deleteUser(@Argument Long id){
        try{
            userService.deleteById(id);
        }catch (Exception ex){
            return false;
        }
        return true;
    }
}

