package ru.bogdanov.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bogdanov.spring.mvc.model.Employee;

import javax.validation.Valid;

/**
 * Формы Spring MVC
 * - form:form - основная форма, которая содержит в себе другие формы
 * - form:input - форма, предназначенная для строки
 * - form:select - выпадающий список
 * - form:radio button - выбираемое значение
 * Валидация данных
 * - Java Standard Bean Validation API - спецификация, описывающая правила валидации
 * - Hibernate Validator - реализация спецификации
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/askDetailsTestModel")
    public String askEmployeeDetails(Model model) {
        // получим сразу объект
        model.addAttribute("employee", new Employee());
        // так же можно получать этот объект откуда угодно и как угодно
        return "model_test/askDetailsViewTestModel";
    }

    @RequestMapping("/showDetailsTestModel")
    // @ModelAttribute - регистрируем параметр, привязывая его к аттрибуту модели
    // @Valid - указываем, что необходима валидация аттрибута
    //
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee
            , BindingResult bindingResult) {
        // определяем логику валидации с помощью BindingResult
        if (bindingResult.hasErrors()) {
            return "model_test/askDetailsViewTestModel";
        } else {
            // можем изменять объекты
            String name = employee.getName();
            employee.setName("Mr. " + name);
            String surname = employee.getSurname();
            employee.setSurname(surname + "!");
            return "model_test/showDetailsViewTestModel";
        }
    }

}
