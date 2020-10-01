package edu.eci.ieti.taskapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.ieti.taskapi.model.User;
import edu.eci.ieti.taskapi.services.user.UserServices;

/**
 *
 * @author jmvillatei
 */

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Autowired
    UserServices uService;
    

    @GetMapping("/users")
    public List<User> getAll() {
        return uService.getAll();
    }
    
    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") String id) {
        return uService.getUserById(id);
    }
    
}
