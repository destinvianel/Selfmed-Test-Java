package com.springBootOne.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootOne.demo.services.ExternalApiSimulatorService;

@RestController
public class OutputController {
	
	@Autowired
	ExternalApiSimulatorService api;;

	
	@GetMapping("/api/output/json")
    public String getAsJsonFormat() {
		return api.XmlToJson();   
       // TODO
    }
	
	@GetMapping("/api/output/xml")
    public String getAsXmlFormat() {
		return api.jsonToXml();   
       // TODO
    }

	//ici il as un certain format pas le meme que celui attendu 
    @GetMapping("/api/output/selfmed")
    public String getAsSelfmedFormat() {
		return api.XmlToSelfMed();
       // TODO
    }


}
