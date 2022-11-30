package com.infobasic.restapitemplate.controller.rest;

import static spark.Spark.*;

import java.util.ArrayList;
import com.infobasic.restapitemplate.controller.rest.util.*;
import com.google.gson.Gson;
import com.infobasic.restapitemplate.controller.rest.util.StandardResponse;
import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.service.UserService;

public class UserController {

    public void startServices(UserService userService) {

        get("/", (req, res) -> "System online!");

        get("/users", (req, res) -> {
            res.type("application/json");

            StandardResponse response = new StandardResponse("200", new Gson().toJsonTree(userService.getAllUsers()));
            return new Gson().toJson(response);
        });

    }

}
