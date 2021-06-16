package com.example.meditationsbackend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServices {

	@PostMapping("/save_note")
	public void greeting(@RequestBody String var) {
		System.out.println(var);
	}
}