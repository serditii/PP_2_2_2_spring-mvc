package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carServise;

    @Autowired
    public CarsController(CarService carServise) {
        this.carServise = carServise;
    }

    @GetMapping
    public String show(@RequestParam(required = false, defaultValue = "5") int count
            , ModelMap model) {
        model.addAttribute("cars", carServise.getListCars(count));
        return "cars";
    }
}
