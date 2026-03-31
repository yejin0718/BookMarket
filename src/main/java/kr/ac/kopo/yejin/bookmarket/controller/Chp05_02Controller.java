package kr.ac.kopo.yejin.bookmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class Chp05_02Controller {

    @GetMapping("/chp0502/name")
    public String requestMethod(String name, Model model) {
        model.addAttribute("name", name);

        return "viewPage05_02";
    }

    @GetMapping("/chp0502/age")
    public String requestMethod(@RequestParam int birthYear, Model model) {
        int currentAge = 0;
        int currentYear = LocalDate.now().getYear();

        currentAge = currentYear-birthYear+1;

        model.addAttribute("currentAge", currentAge);

        return "viewPage05_02_01";
    }

}
