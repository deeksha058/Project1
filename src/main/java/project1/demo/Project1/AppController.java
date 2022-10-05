package project1.demo.Project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

//    @Autowired
    private User user;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public  String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "signup_form";
    }

    @PostMapping("/processRegister")
    public String processRegistration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "registration_success";
    }
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepository.findAll();
        List<User> listUser2 = new ArrayList<>();
        for (User it: listUsers ){
            System.out.println(it.getLastName());
            if (!(it.getLastName().isEmpty())){
                listUser2.add(it);
            }
        }
        for (User it: listUser2){
            System.out.println(it.getEmail()+" lastName "+it.getLastName()+" "+it.getFirstName()+" "+it.getPassword());
        }
        model.addAttribute("listUser2", listUser2);

        return "users";
    }

}
