package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCars;

@Controller
public class CarController {

    private ServiceCars serviceCars;

    @Autowired
    public CarController(ServiceCars serviceCars) {
        this.serviceCars = serviceCars;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int i, ModelMap model) {
        model.addAttribute("carArrayList", serviceCars.cars(i));
        return "cars";
    }

}
