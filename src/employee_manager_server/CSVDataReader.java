package employee_manager_server;

import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader{

	private String CSVFilePath;
	private List<Person> persons;
	
	
		
	public CSVDataReader(String cSVFilePath) {
		super();
		CSVFilePath = cSVFilePath;
	}

	public Set<Person> getPersons() {
		return (Set) persons;
	}

}
