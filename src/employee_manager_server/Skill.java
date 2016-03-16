package employee_manager_server;

import java.io.Serializable;

public class Skill implements Serializable {
	
	private String name;
	private String description;
	private double rate;
	
	public Skill(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
		
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getRate() {
		return rate;
	}

}
