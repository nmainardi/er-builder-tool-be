package com.eldenringbuildertool.erbuildertool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/test")
	public String ciao() {
		return("ciao");
	}
}
