package employee_manager_server;

import java.util.List;

class Person {
	
	String name;
	String email;
	List<Skill> skillset;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Skill> getSkillset() {
		return skillset;
	}
	
	public void setSkillset(List<Skill> skillset) {
		this.skillset = skillset;
	}
	
	public void addSkill(Skill skill) {
		
	}
}