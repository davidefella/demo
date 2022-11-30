package com.infobasic.restapitemplate.persistance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.infobasic.restapitemplate.model.User;

public class DatabaseInit {

    public static List<User> initUsers() {
        List<User> users = new ArrayList<User>();

        for (int i = 0; i < 10000; i++) {
            users.add(new User(i,
                        "username" + i,
                    "email" + i,
                    LocalDateTime.now().toString(),
                    true,
                    "role" + i));
        }

        return users; 
    }
}
