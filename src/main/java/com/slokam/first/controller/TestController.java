package com.slokam.first.controller;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.slokam.first.pojo.ABC;

@RestController
@RequestMapping("test")
public class TestController {
	@RequestMapping(method=RequestMethod.GET,value="/all")
	
	public ResponseEntity<ABC> getAll(){
		 RestTemplate template=new RestTemplate();
		 ResponseEntity<ABC> forEntity =template.getForEntity("http://localhost:8080/student/all",ABC.class);
		 ABC body= forEntity.getBody();
		// body.setName("Hello slokam");
		 ResponseEntity<ABC> response=new ResponseEntity<>(body,HttpStatus.OK);
		 return response;
	}

}
