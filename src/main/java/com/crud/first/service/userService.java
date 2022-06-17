package com.crud.first.service;

import com.crud.first.entity.User;
import com.crud.first.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepo repository;
    // post methods
    public User saveUser(User User){
        return repository.save(User);
    }

    public List<User> saveUsers(List<User> User){
        return repository.saveAll(User);
    }

    // get methods
    public List<User> getAll(){
        return repository.findAll();
    }

    public User getByUserName(String username){
        return repository.findByUsername(username).orElse(null);
    }

    // delete methods

    public String deleteid(int id){
        repository.deleteById(id);
        return "deleted";
    }


}
