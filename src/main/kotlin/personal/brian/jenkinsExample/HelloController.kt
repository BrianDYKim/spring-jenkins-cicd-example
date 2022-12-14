package personal.brian.jenkinsExample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Brian
 * @since 2022/10/07
 */
@RestController
@RequestMapping("/api/v1")
class HelloController {

    @GetMapping("/hello1")
    fun hello1(): String = "first hello!!"

    @GetMapping("/hello2")
    fun hello2(): String = "second hello!!"

    @GetMapping("/hello3")
    fun hello3(): String = "third hello!!"
}