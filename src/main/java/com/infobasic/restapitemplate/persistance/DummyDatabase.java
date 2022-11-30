package com.infobasic.restapitemplate.persistance;

import java.util.ArrayList;
import java.util.List;

import com.infobasic.restapitemplate.model.User;

/*
 * Simulo un Database esistente
 */
public class DummyDatabase {
    
    List<User> users; 

    public DummyDatabase(){
        users = new ArrayList<User>(); 
    }

    public void save(User u){
        users.add(u); 
    }

    public List<User> getAllUsers(){
        return users; 
    }


}
