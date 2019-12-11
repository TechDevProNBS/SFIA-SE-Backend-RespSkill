package com.nationwide.app.repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.nationwide.app.model.SkillLevel;

/***Communicates with {@link SkillLevelController} with the {@link findBySkillNameIn} function, listing all details regarding each skill name passed through.
 * @author willg
 *
 */
@Repository
public interface SkillLevelRepository extends MongoRepository<SkillLevel, String> {
	public List<SkillLevel> findAll();
	public List<SkillLevel> findBySkillnameIn(List<String> skill_name);
	public List<SkillLevel> findBySkillname(String skill_name);
	

	
}

