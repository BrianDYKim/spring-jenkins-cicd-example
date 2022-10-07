package personal.brian.jenkinsExample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringJenkinsCicdExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringJenkinsCicdExampleApplication>(*args)
}
