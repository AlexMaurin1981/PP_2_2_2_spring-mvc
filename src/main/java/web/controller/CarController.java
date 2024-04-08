package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import javax.xml.transform.sax.SAXResult;
import java.util.List;

@Controller
public class CarController {
@Autowired
private CarService carService;
@GetMapping("/cars")
public String getShowCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model){

    model.addAttribute("cars", carService.getListCar(count));
    return "cars";
    }

}
