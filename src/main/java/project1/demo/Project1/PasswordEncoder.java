package project1.demo.Project1;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String rawPassword = "nam2020";
    String encodedPassword = encoder.encode(rawPassword);
}
