package web.controller;

import Service.CarsServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, Model model) {
        CarsServiceImp carsService = new CarsServiceImp();
        System.out.println(carsService.getCars(count).toString());
        model.addAttribute("messages", carsService.getCars(count));
        return "cars";
    }
}
