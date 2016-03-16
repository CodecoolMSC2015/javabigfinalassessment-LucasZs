package employee_manager_server;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader{

	private String CSVFilePath;
	private List<Person> persons;
	
	
	public CSVDataReader(String CSVFilePath) {
		super();
		try {
			File file = new File("test.csv");
			Path path = FileSystems.getDefault().getPath(CSVFilePath);
			List<String> lines;
			lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			for (String line : lines) {
		        String[] array = line.split(",");
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
