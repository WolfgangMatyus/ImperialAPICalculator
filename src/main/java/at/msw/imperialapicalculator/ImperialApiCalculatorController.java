package at.msw.imperialapicalculator;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class ImperialApiCalculatorController {
    ImperialApiCalculator calc = new ImperialApiCalculator();

    @GetMapping("/convertInches")
    public double convertInchesToCm(@RequestParam double a) {
        return calc.convertInchesToCm(a);
    }
}
