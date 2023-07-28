package com.example.pp_31._SpringBoot.dao;


import com.example.pp_31._SpringBoot.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void delete(int id);

    void updateUser(int id, User updateUser);

}
