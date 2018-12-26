package by.peekhovsky.restview.controller;

import by.peekhovsky.restview.model.User;
import by.peekhovsky.restview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


/**
 * @author Rostislav Pekhovsky 2018
 */
@RestController
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> allUsers() {
        return userService.findAllUsers();
    }


    @GetMapping("/users/{page-num}")
    public User getMainPage(ModelMap model,
                            @PathVariable(value = "page-num") long pageNumber) {
        Optional<User> user = userService.findById(pageNumber);
        return user.orElse(new User());
    }
}