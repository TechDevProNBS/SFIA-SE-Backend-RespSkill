package com.nationwide.app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.nationwide.app.repository.SkillLevelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.app.model.SkillLevel;

/**Maps the {@link findBySkillNameIn} function from {@link SkillLevelRepository} .
 * @author willg
 *
 */
@RestController
@CrossOrigin("*")
public class SkillLevelController {

	@Autowired
	private SkillLevelRepository repo;
	
	@RequestMapping("/API/SkillLevel/findAll")
	public List<SkillLevel> findAll() {
		return repo.findAll();
	}
	
	@RequestMapping("/API/SkillLevel/findIn")
	public List<SkillLevel> findIn(@RequestParam List<String> skill_name){
		return repo.findBySkillnameIn(skill_name);
	}
	
	@RequestMapping("/API/SkillLevel/findBySkillName")
	public List<SkillLevel> findBySkillName(@RequestParam String skill_name){
		return repo.findBySkillname(skill_name);
	}


}

