package org.ost.investigate.spark.rest;

import org.ost.investigate.spark.rest.User;
import org.ost.investigate.spark.rest.UserException;

import java.util.Collection;

public interface UserService {
    public void addUser(User user);

    public Collection<User> getUsers();

    public User getUser(String id);

    public User editUser(User user) throws UserException;

    public void deleteUser(String id);

    public boolean userExist(String id);
}
