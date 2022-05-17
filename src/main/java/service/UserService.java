package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import repo.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    @PostMapping("/createUser")
    public void createUser() {
        userRepository.createUser();
    }
}
