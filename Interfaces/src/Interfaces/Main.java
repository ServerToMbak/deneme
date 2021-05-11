package Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager	(loggers);
		Customer engin=new Customer(1," engin ","Demiroð");
		Customer server=new Customer(2," server "," tombak");
			
		customerManager.Add(engin);
		
		
		
		
		
		
		}




}