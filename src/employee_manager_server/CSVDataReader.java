package employee_manager_server;

import java.util.List;
import java.util.Set;

class CSVDataReader extends DataReader{

	String CSVFilePath;
	List<Person> persons;
	
	
		
	public CSVDataReader(String cSVFilePath) {
		super();
		CSVFilePath = cSVFilePath;
	}



	Set<Person> getPersons() {
		
		return null;
	}
}
