import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/home")
    //関数名がhomeだとエラーになった
    String test() {
        return "Home";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
