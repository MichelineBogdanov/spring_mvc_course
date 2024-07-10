package ru.bogdanov.spring.mvc.model;

import ru.bogdanov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "name must be minimum 2 symbols")
    private String name;
    @NotEmpty(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "min = 500")
    @Max(value = 1000, message = "max = 1000")
    private int salary;
    private String department;
    private Map<String, String> departments = new HashMap<>();
    private String carBrand;
    private Map<String, String> carBrands = new HashMap<>();
    private List<String> languages = new ArrayList<>();
    private List<String> empLanguages = new ArrayList<>();
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "qwe.com", message = "email must end qwe.com")
    private String email;

    public Employee() {
        departments.put("Information Technologies", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands.put("BMW", "BMW");
        carBrands.put("AUDI", "AUDI");
        carBrands.put("Mercedes", "Mercedes");

        languages.add("FR");
        languages.add("EN");
        languages.add("DE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getEmpLanguages() {
        return empLanguages;
    }

    public void setEmpLanguages(List<String> empLanguages) {
        this.empLanguages = empLanguages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
