package employee_manager_server;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader{

	private Path CSVFilePath;
	private List<Person> persons;
	
	
	public CSVDataReader(String cSVFilePath) {
		super();
		File file = new File("test.csv");
		CSVFilePath = file.toPath();
		List<String> lines;
		try {
			lines = Files.readAllLines(file.toPath(), 
			        StandardCharsets.UTF_8);
			for (String line : lines) {
		        String[] array = line.split(",");
		        System.out.println(array[0]);
				}
			
			}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	public Set<Person> getPersons() {
		return (Set) persons;
	}

}
