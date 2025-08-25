package dev.eastgate.jvm.jvmdemo.service;

import dev.eastgate.jvm.jvmdemo.dto.User;
import org.springframework.stereotype.Service;

@Service
public class JaveDemoService {
    public String getProjectName() {
        return "Demo Project";
    }

    public String processData(String username, Integer age) {
        User user = new User(username, age);

        String message = "My name is " + username + ", " + age + " years old";
        String message2 = "My name is " + user.getUsername() + ", " + user.getAge() + " years old";
        String message3 = "My name is " //
                + user.getUsername() //
                + ", " + user.getAge() + " years old";

        return message3;
    }
}
