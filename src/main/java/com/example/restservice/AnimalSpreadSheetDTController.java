package com.example.restservice;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalSpreadSheetDTController {
	@Autowired
	private KieSession session;
	@PostMapping("/animal")
	public Animal greeting(@RequestBody Animal animal) {
		session.insert(animal);
		session.fireAllRules();
		return animal;
	}

}
