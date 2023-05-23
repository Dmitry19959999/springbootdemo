package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
