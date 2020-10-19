package hello;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.joda.time.LocalTime;

public class HelloWorld {
	private static final Logger logger = LogManager.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		
		logger.error("Application is running!");		
	}
}
