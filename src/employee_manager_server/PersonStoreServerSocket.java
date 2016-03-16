package employee_manager_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class PersonStoreServerSocket {

	private DataReader store;
	
	public PersonStoreServerSocket() throws IOException {
	
		ServerSocket ss = new ServerSocket(5678);
		Socket s = ss.accept();
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		ObjectInputStream ois = new ObjectInputStream(is);
	
	}
	
	void start() {
		
	}
	
	public static void main(String[] args) {
		
		try {
			PersonStoreServerSocket psss = new PersonStoreServerSocket();
			psss.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
