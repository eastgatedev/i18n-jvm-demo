package dev.eastgate.jvm.jvmdemo.rest.controller;

import dev.eastgate.jvm.jvmdemo.dto.User;
import dev.eastgate.jvm.jvmdemo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaHelloRestController2 {
    private final Logger logger = LoggerFactory.getLogger(JavaHelloRestController2.class);
    private final DemoService demoService;

    public JavaHelloRestController2(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/java-rest-hello2")
    public String hello(@RequestParam String username, @RequestParam int age) {
        String title = "Hello World";

        User user = new User(username, age);

        String message = "My name is " + username + ", " + age + " years old";
        String message2 = "My name is " + user.getUsername() + ", " + user.getAge() + " years old";
        String message3 = "My name is " //
                + user.getUsername() //
                + ", " + user.getAge() + " years old";

        System.out.println("Hello endpoint called");
        return "Hello World!";
    }
}
