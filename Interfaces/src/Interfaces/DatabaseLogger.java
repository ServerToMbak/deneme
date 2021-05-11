package Interfaces;

public class DatabaseLogger implements Logger {
	@Override
	public void Log(String Message) {
		System.out.println("Database loglandý : "+Message);
	}
	
	
	
}
