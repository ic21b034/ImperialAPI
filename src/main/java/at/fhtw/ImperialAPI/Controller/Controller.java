package at.fhtw.ImperialAPI.Controller;

import at.fhtw.ImperialAPI.Converter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Converter converter = new Converter();
    @GetMapping("/")
    String hello() {
        return"Hello";
    }

   @GetMapping("InchToCm/{inch}")
   double inch(@PathVariable double inch) {
       return converter.convertInchToCm(inch);
   }

    @GetMapping("YardToMeter/{m}")
    double m(@PathVariable double m) {
        return converter.convertYardToMeter(m);
    }


}
