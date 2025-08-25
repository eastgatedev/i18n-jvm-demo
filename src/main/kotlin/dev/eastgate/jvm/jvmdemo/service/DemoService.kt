package dev.eastgate.jvm.jvmdemo.service

import org.springframework.stereotype.Service

@Service
class DemoService {
    fun getProjectName() = "Demo Project"

    fun processData(username: String, age: Int):String {
        val user = object {
            val username = username
            val age = age
        }

        val message = "My name is $username, $age years old"

        val message2 = "My name is {0}, {1} years old"

        val message3 = "My name is ${user.username}, ${user.age} years old"

        return message3
    }
}