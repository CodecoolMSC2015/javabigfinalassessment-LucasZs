package employee_manager_server;

class Employee extends Person {
	
	public Employee(String name, String email) {
		super(name, email);
	
	}

	int salary;
	String jobTitle;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

		public String toString() {
			
			return null;
			
		}
}
