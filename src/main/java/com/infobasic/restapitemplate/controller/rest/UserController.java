package com.infobasic.restapitemplate.controller.rest;

import static spark.Spark.*;

import com.infobasic.restapitemplate.service.UserService;

public class UserController {

    UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public static void startServices() {

        get("/", (req, res) -> "System online!");
    }

}
