package com.infobasic.restapitemplate.service;

import java.util.List;

import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.model.dao.UserDao;
import com.infobasic.restapitemplate.model.dao.impl.UserDaoImpl;
import com.infobasic.restapitemplate.persistance.DatabaseInit;
import com.infobasic.restapitemplate.persistance.DummyDatabase;

public class UserService {
    DummyDatabase database; //Con JDBC e DAO diventa superfluo (va tolto)
    UserDao userDao; 

    public UserService() {
        database = new DummyDatabase();

        userDao = new UserDaoImpl(); 

        for(User u : DatabaseInit.initUsers()){
            addUser(u); 
        }
    }

    public void addUser(User u) {
        //database.save(u);

        userDao.save(u);
    }

    /*TODO: Scrivere il codice per aggiornamento dei dati */
    public User updateUser(User u) {
        return u; 
    }

    public List<User> getAllUsers() {
        return database.getAllUsers();
    }

    public List<User> getAllUsersByName(String name) {
        return database.getAllUsers();
    }

    /**
     * TODO: Implementare metodo di ricerca in Database.java
     */
    public User getUserById(int id) {

        // Sono sicuro ci sono i dati perché ho il mio init database
        return database.getAllUsers().get(0); 
    }

        /**
     * TODO: Implementare metodo di cancellazione in Database.java
     */
    public void deleteUserById(int id) {
    }

}
