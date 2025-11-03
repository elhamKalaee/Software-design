package calculatorweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


        private Caculate calculator = new Caculate();

        @GetMapping("/add")
        public double add(@RequestParam double a, @RequestParam double b) {
            return calculator.caculateSum(a, b);
        }

        @GetMapping("/subtract")
        public double subtract(@RequestParam double a, @RequestParam double b) {
            return calculator.caculateMinus(a, b);
        }

        @GetMapping("/multiply")
        public double multiply(@RequestParam double a, @RequestParam double b) {
            return calculator.calculateMultiply(a, b);
        }

        @GetMapping("/divide")
        public double divide(@RequestParam double a, @RequestParam double b) {
            return calculator.calculateDivide(a, b);
        }
    }


