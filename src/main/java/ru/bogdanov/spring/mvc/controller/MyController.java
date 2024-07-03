package ru.bogdanov.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller // указывает спрингу, что это бин контроллер
// @RequestMapping("/emp") // можно указывать над классом, тогда для всех методов будет добавляться вначале
public class MyController {

    @RequestMapping("/") // связывает адрес и view
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "askDetailsView";
    }

    //@RequestMapping("/showDetails")
    //public String showDetails() {
    //    return "showDetailsView";
    //}

    //@RequestMapping("/showDetails")
    //public String showDetails(HttpServletRequest request, Model model) {
    //    String name = request.getParameter("empName");
    //    name = "Mr. " + name;
    //    model.addAttribute("nameAttr", name);
    //    return "showDetailsView";
    //}

    // значение параметра можно получить напрямую
    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("empName") String name, Model model) {
        name = "Mr. " + name;
        model.addAttribute("nameAttr", name);
        return "showDetailsView";
    }

}
