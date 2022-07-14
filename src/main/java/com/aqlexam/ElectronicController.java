package com.aqlexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectronicController {

	@Autowired
	private ElectronicRepository electronicrepository;
	
	@GetMapping("/all")
	public List<Electronic> getAllElectronics(){
		return electronicrepository.findAll();
	}
	
	@PostMapping("/electronic")
	public Electronic saveElectronic(@RequestBody Electronic electronic) {
		return electronicrepository.save(electronic);
	}
}
