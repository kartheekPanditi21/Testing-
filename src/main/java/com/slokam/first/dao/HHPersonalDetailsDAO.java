package com.slokam.first.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.first.pojo.PersonalDetailsEntity;
@Repository
public interface HHPersonalDetailsDAO extends JpaRepository<PersonalDetailsEntity, Integer> {

}
