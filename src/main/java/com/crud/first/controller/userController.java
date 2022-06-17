package com.crud.first.controller;

import com.crud.first.entity.User;
import com.crud.first.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private userService service;

    // get controller
    @GetMapping("/getAll")
    public List<User> getAll(){
        return service.getAll();
    }
    @GetMapping("get/{id}")
    public User getByUserName(@PathVariable String username){
        return service.getByUserName(username);
    }
    // post controller
    @PostMapping("/addUser")
    public User addUser(@RequestBody User User){
        return service.saveUser(User);
    }

    // deleted
    @PutMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteid(id);
    }
}
