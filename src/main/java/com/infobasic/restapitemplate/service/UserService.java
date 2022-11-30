package com.infobasic.restapitemplate.service;

import java.util.List;

import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.persistance.DummyDatabase;

public class UserService {
    DummyDatabase database;

    public UserService() {
        database = new DummyDatabase();

        User u1 = new User(1, "myUsername", "myEmail", null, true, "ADMIN");
        addUser(u1);

    }

    public void addUser(User u) {
        database.save(u);
    }

    public List<User> getAllUsers() {
        return database.getAllUsers();
    }

}
