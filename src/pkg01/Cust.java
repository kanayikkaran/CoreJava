package pkg01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cust {

String firstname;
String lastname;
String emailid;
String phonenum;
String password;

public static void main(String[] args) {

	
	Logger logger = LogManager.getLogger(Cust.class);
	/*logger.info("INFO LOG");
	logger.debug("DEBUG LOG");
	logger.error("ERROR LOG");
	logger.fatal("FATAL LOG");*/
	logger.info("New new Event");
	
	System.out.println("SYSO");
	
}
	
}
