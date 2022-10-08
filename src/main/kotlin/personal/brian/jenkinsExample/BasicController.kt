package personal.brian.jenkinsExample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Brian
 * @since 2022/10/08
 */
@RestController
class BasicController {

    @GetMapping("/health")
    fun healthCheck(): String = "Healthy!"
}