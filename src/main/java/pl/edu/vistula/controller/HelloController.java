package pl.edu.vistula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // 1️⃣ Plain text endpoint (REST-style)
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, my first Spring controller!";
    }

    // 2️⃣ MVC endpoint with Thymeleaf
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "Student") String name,
            Model model) {

        model.addAttribute("name", name);
        return "greeting";
    }
}
