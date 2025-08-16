package dev.eastgate.jvm.jvmdemo.rest.controller

import dev.eastgate.jvm.jvmdemo.service.DemoService
import org.slf4j.LoggerFactory
import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val demoService: DemoService,
    private val messageSource: MessageSource
) {
    private val logger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/hello")
    fun hello(@RequestParam username: String, @RequestParam age: Int): String {
        val locale = LocaleContextHolder.getLocale()
        val title = "Hello World"

        val user = object {
            val username = username
            val age = age
        }

        val message = "My name is $username, $age years old"

        val message2 = "My name is {0}, {1} years old"

        val message3 = "My name is ${user.username}, ${user.age} years old"

        val message4 = """
            My name is $username, $age years old
        """.trimIndent()

        val message5 = "My name is " + user.username + ", " + user.age + " years old"

        val message6 = "My name is " +
                user.username + ", " +
                user.age + " years old"

        val message7 = "My name is " + //
                user.username + ", " + //
                user.age + " years old"

        println("Hello endpoint called")
        return "Hello World!"
    }
}
