package Interfaces;

public class FileLogger implements Logger{
	@Override
		public void Log(String Message) {
		System.out.println("dosya loglandý : "+ Message);
	}

	
		
}
