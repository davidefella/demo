package com.infobasic.restapitemplate.controller.rest;

import static spark.Spark.*;

import com.google.gson.Gson;
import com.infobasic.restapitemplate.controller.rest.util.StandardResponse;
import com.infobasic.restapitemplate.model.User;
import com.infobasic.restapitemplate.service.UserService;

public class UserController {

    public void startServices(UserService userService) {

        get("/", (req, res) -> "System online!");

        get("/user", (req, res) -> {
            res.type("application/json");

            StandardResponse response = new StandardResponse("200",
                    new Gson().toJsonTree(userService.getAllUsers()));
            return new Gson().toJson(response);
        });

        get("/user/id/:id", (req, res) -> {
            res.type("application/json");

            int paramID = Integer.parseInt(req.params("id"));

            StandardResponse response = new StandardResponse("200",
                    new Gson().toJsonTree(userService.getUserById(paramID)));
            return new Gson().toJson(response);
        });

        get("/user/name/:name", (req, res) -> {
            res.type("application/json");

            String paramName = req.params("name");

            StandardResponse response = new StandardResponse("200",
                    new Gson().toJsonTree(userService.getAllUsersByName(paramName)));
            return new Gson().toJson(response);
        });


        delete("/user/delete/id/:id", (req, res) -> {
            res.type("application/json");

            int paramID = Integer.parseInt(req.params("id"));
            userService.deleteUserById(paramID);

            return new Gson().toJson(new StandardResponse("200"));

        });

        post("/user/create", (req, res) -> {
            res.type("application/json");

            User userFromRequest = new Gson()
                    .fromJson(req.body(), User.class);

            userService.addUser(userFromRequest);

            return new Gson().toJson(new StandardResponse("200"));
        });

    }

}
