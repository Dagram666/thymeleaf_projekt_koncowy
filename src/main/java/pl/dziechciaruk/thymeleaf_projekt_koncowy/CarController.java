package pl.dziechciaruk.thymeleaf_projekt_koncowy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

@GetMapping("/car")
    public String getCar(Model model){
    Car car = new Car("BMW","E39");
    model.addAttribute("name","Paweł");
    model.addAttribute("auto",car);
    return "car" ;
}



}
