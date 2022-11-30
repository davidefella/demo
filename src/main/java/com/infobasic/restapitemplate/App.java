package com.infobasic.restapitemplate;


import com.infobasic.restapitemplate.controller.rest.UserController;
import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.service.UserService;


public class App 
{
    public static void main( String[] args )
    {

        UserService userService = new UserService(); //Init della classe che sa come gestire il database

        UserController userController = new UserController(); //Avvio classe che espone i servizi
        userController.startServices(userService); 
    }
}
