package com.infobasic.restapitemplate.service;

import java.util.List;

import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.persistance.DummyDatabase;

/**
 * + addUser (User u)
 * + getUsers()
 * editUser()
 * + deleteUser()
 */
public class UserService {
    DummyDatabase database;

    public UserService() {
        database = new DummyDatabase();
    }

    public void addUser(User u) {
        database.save(u);
    }

    public List<User> getAllUsers(){
        return database.getAllUsers(); 
    }

}
