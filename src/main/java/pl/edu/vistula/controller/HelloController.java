package pl.edu.vistula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, my first Spring controller!";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Hello Vistula, my first Spring controller!");
        return "greeting";
    }
}
