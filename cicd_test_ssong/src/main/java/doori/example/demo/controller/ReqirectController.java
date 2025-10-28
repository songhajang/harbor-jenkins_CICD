package doori.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class ReqirectController {
	@GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
