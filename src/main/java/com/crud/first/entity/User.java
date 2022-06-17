package com.crud.first.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {


    @NotEmpty
    @Size(min=4, max=25, message = "name must be of length 1-25")
    String firstName;
    @Size(min=0, max=25, message = "name must be of length 1-25")
    String lastName;
    @NotEmpty
    @Size(min=10, max=10, message = "please enter valid email address")
    String phoneNo;
    @Id
    @Email(regexp = "^(.+)@(.+)$", message = "please enter valid email address")
    String username;
    int age;
    @NotEmpty
    String password;
}
