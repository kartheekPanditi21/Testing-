package com.slokam.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.first.pojo.PersonalDetailsEntity;
import com.slokam.first.service.HHPersonalDetailsService;
import com.slokam.first.service.IHHPersonalDetailsService;

@RestController
@RequestMapping("PersonalDetails")
public class HHPersonalDetailsController {
	@Autowired
	private IHHPersonalDetailsService detailsService; 
	
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public ResponseEntity<List<PersonalDetailsEntity>> getAll(){
		List<PersonalDetailsEntity> data=detailsService.getAllPersonalDetails();
		ResponseEntity<List<PersonalDetailsEntity>> result=new ResponseEntity<List<PersonalDetailsEntity>>(data,HttpStatus.OK);
		return result;
	}

}
