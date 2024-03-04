package ru.galaxy.logs.parser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LogsParserApplication

fun main(args: Array<String>) {
	runApplication<LogsParserApplication>(*args)
}
