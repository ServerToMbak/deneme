package Interfaces;

public class SmsLogger implements Logger{

	@Override
	public void Log(String Message) {
		System.out.println("Sms loglandý"+Message);
		
	}

}
