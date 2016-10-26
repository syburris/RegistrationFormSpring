package com.YoungMoney.controllers;

import com.YoungMoney.entities.User;
import com.YoungMoney.services.UserRepo;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;

/**
 * Created by stevenburris on 10/26/16.
 */
@RestController
public class RegistrationFormController {

    @Autowired
    UserRepo users;

    Server h2Server;

    @PostConstruct
    public void init() throws SQLException {
        h2Server = Server.createWebServer().createWebServer().start();
    }

    @PreDestroy
    public void destroy() {
        h2Server.stop();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return users.save(user);
    }

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public Iterable<User> getUsers() {
        return users.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
        return users.save(user);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id) {
        users.delete(id);
    }
}
