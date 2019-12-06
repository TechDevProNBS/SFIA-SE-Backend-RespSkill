package com.nationwide.app.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**Mirrors data structure for the skill level page from skill_level collection on MongoDB Atlas.
 * Contains {@link Skill_Descriptions} and {@link Skill_Criteria}.
 * @author willg
 *
 */
@Document(collection = "skill_level")

public class SkillLevel {
	@Field("skill_name")
	private String skillname;
	@Field("skill_descriptions")
	private List<Skill_Descriptions> skilldescriptions;
	
	//Setter and Getter methods
	public String getSkill_name() {
		return skillname;
	}
	public void setSkill_name(String skill_name) {
		this.skillname = skill_name;
	}
	
	public List<Skill_Descriptions> getSkill_descriptions() {
		return skilldescriptions;
	}
	public void setSkill_descriptions(List<Skill_Descriptions> skill_descriptions) {
		this.skilldescriptions = skill_descriptions;
	}
	

}
