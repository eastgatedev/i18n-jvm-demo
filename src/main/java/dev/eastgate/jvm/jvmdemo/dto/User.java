package dev.eastgate.jvm.jvmdemo.dto;

public class User {
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
