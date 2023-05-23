package net.proselyte.springbootdemo.dao;

import net.proselyte.springbootdemo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
