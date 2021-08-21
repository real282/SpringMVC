package web.controller;

import Model.Cars;
import Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, Model model) {
        int count = Integer.parseInt(request.getParameter("count"));
        System.out.println(Cars.getCars(count).toString());
        model.addAttribute("messages", Cars.getCars(count));
        return "cars";
    }
}
