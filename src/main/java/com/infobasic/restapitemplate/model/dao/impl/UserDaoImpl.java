package com.infobasic.restapitemplate.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.model.dao.UserDao;
import com.infobasic.restapitemplate.util.ConnectionManager;

public class UserDaoImpl implements UserDao {

    //User mi arriva dal service! 
    @Override
    public void save(User user) {
        Connection connection = ConnectionManager.getConnetion(); 
        
        try (PreparedStatement saveUserStatement = connection
                    .prepareStatement("INSERT INTO userTable ('username', 'email') VALUES (?,?")) {
                                            
            saveUserStatement.setString(1, user.getUsername()); // Sostituisco il PRIMO ? con lo username                                           
            saveUserStatement.setString(2, user.getEmail()); //  
            
            int rowInserted = saveUserStatement.executeUpdate(); 

            System.out.println("LOG: Inserimento di " + rowInserted + "righe" ); 


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


    /*private String username; 
    private String email; 
    private String dateRegistered; //data e ora di registrazione
    private boolean isEnabled = true; 
    private String role;*/



    @Override
    public User findByID(int id) {

        return null;
    }

    @Override
    public void deleteUserById(int id) {

    }

    @Override
    public User updateUser(User user) {
        return null;
    }

}
