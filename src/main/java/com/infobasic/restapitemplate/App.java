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

        UserController userController = new UserController(); 
        userController.startServices(userService); 
    }
}
