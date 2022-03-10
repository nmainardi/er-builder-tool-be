package com.eldenringbuildertool.erbuildertool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eldenringbuildertool.erbuildertool.service.GearService;

@RestController
public class GearController {
	
	@GetMapping("/api/gear")
	public String ciao() {
		GearService.getElmetti();
		GearService.getCorpetti();
		GearService.getGuanti();
		GearService.getPantaloni();
		return("ciao");
	}
	
}
