package dev.eastgate.jvm.jvmdemo.rest.controller;

import dev.eastgate.jvm.jvmdemo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaHelloController2 {
    private final Logger logger = LoggerFactory.getLogger(JavaHelloController2.class);
    private final DemoService demoService;

    public JavaHelloController2(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/java-hello2")
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

    private static class User {
        private final String username;
        private final int age;

        public User(String username, int age) {
            this.username = username;
            this.age = age;
        }

        public String getUsername() {
            return username;
        }

        public int getAge() {
            return age;
        }
    }
}
