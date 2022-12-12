package com.infobasic.restapitemplate.model.dao;

import com.infobasic.restapitemplate.model.User;

public interface UserDao {
    
    public void save(User user); 

    // Posso avere anche altri findBy...
    public User findByID(int id); 

    // Posso avere anche altri deleteBy...
    public void deleteUserById (int id); 

    public User updateUser(User user); 
}
