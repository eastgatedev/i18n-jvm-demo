package dev.eastgate.jvm.jvmdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JvmDemoApplication

fun main(args: Array<String>) {
	runApplication<JvmDemoApplication>(*args)
}
