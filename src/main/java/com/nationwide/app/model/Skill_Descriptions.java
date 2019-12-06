package com.nationwide.app.model;

import java.util.List;

/**Embedded within {@link SkillLevel} class to define the skills and their criteria. Contains {@link Skill_Criteria}.
 * @author willg
 *
 */
public class Skill_Descriptions {
	
	private int level;
	private List<Skill_Criteria> skill_criteria;
	
	//Setter and Getter methods
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public List<Skill_Criteria> getSkill_criteria() {
		return skill_criteria;
	}
	public void setSkill_criteria(List<Skill_Criteria> skill_criteria) {
		this.skill_criteria = skill_criteria;
	}
	
	

}
