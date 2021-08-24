package web.controller;

import Service.CarsService;
import Service.CarsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    private final CarsServiceImp carsService;

    @Autowired
    public CarsController(CarsServiceImp carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, Model model) {
        model.addAttribute("messages", carsService.getCars(count));
        return "cars";
    }
}
