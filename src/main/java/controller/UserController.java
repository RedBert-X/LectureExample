package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/createUser")
    void createUser() {
        userService.createUser();
    }

}
