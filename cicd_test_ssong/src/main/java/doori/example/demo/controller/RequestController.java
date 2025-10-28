package doori.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	
	@GetMapping("/get")
	public String getMod() {
		return  "Get 테스트 API upate";
	}
	
	@PostMapping("/post")
	public String postMod() {
		return "Post 테스트 API";
	}
}
