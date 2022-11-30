package com.infobasic.restapitemplate.service;

import java.util.List;

import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.persistance.DatabaseInit;
import com.infobasic.restapitemplate.persistance.DummyDatabase;

public class UserService {
    DummyDatabase database;

    public UserService() {
        database = new DummyDatabase();

        for(User u : DatabaseInit.initUsers()){
            addUser(u); 
        }
    }

    public void addUser(User u) {
        database.save(u);
    }

    public List<User> getAllUsers() {
        return database.getAllUsers();
    }

}
