package com.slokam.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.slokam.first.dao.HHPersonalDetailsDAO;
import com.slokam.first.pojo.PersonalDetailsEntity;
@Service
public class HHPersonalDetailsService implements IHHPersonalDetailsService {
	@Autowired
     private HHPersonalDetailsDAO ghPersonalDetailsDAO;

	@Override
	public List<PersonalDetailsEntity> getAllPersonalDetails() {
		List<PersonalDetailsEntity> listBasicDetails=ghPersonalDetailsDAO.findAll();
		return listBasicDetails;
	}
	
	
	

	

	
	
}
