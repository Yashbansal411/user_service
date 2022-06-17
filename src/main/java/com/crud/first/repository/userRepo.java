package com.crud.first.repository;

import com.crud.first.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface userRepo extends JpaRepository<User,Integer>{
    Optional<User> findByUsername(String username);
}
