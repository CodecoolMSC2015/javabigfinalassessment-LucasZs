package employee_manager_server;

import java.util.Set;

public class DataReader {

	private String searchCriteria;
	private SearchType searchType;
	
	
	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}
	
	Set<Person> getPersons(String skills, SearchType searchType) {
		
		return null;
	}
	
}
