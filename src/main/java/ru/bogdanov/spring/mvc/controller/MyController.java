package ru.bogdanov.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // указывает спрингу, что это бин контроллер
public class MyController {

    @RequestMapping("/") // связывает адрес и view
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "askDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showDetails() {
        return "showDetailsView";
    }

}
