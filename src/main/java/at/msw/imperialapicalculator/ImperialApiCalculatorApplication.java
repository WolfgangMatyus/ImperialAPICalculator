package at.msw.imperialapicalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ImperialApiCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImperialApiCalculatorApplication.class, args);
    }

}

@RestController
class Hallo{

    @GetMapping("/hi")
    public String hi(){
        return "Hallo";
    }
}