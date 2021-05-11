package Interfaces;

public class EmailLogger implements Logger {

	@Override
	public void Log(String Message) {
		System.out.println(" email gönderildi :" + Message);
		
	}

}
