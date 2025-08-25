package dev.eastgate.jvm.jvmdemo.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class JavaHelloRestController {
    private final MessageSource messageSource;
    private final Logger logger = LoggerFactory.getLogger(JavaHelloRestController.class);

    public JavaHelloRestController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/java-rest-hello")
    public String hello(@RequestParam String username, @RequestParam int age) {
        Locale locale = LocaleContextHolder.getLocale();
        String title = "Hello World";

        User user = new User(username, age);

        String message = "My name is " + username + ", " + age + " years old";
        String message2 = "My name is " + user.getUsername() + ", " + user.getAge() + " years old";
        String message3 = "My name is "
                + user.getUsername()
                + ", " + user.getAge() + " years old";
        String message4 = "My name is " //
                + user.getUsername() //
                + ", " + user.getAge() + " years old";

        logger.info(messageSource.getMessage("helloEndpointCalled", null, locale));
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
