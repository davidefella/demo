package com.infobasic.restapitemplate;


import com.infobasic.restapitemplate.controller.rest.UserController;
import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        UserService userService = new UserService(); 

        User u1 = new User(1, "myUsername", "myEmail", null, true, "ADMIN"); 
        userService.addUser(u1);

        System.out.println( userService.getAllUsers() ); 
    
        UserController.startServices(); 
    }
}
