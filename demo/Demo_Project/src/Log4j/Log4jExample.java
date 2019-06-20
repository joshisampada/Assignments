package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jExample
{

	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger(Log4jExample.class);
        BasicConfigurator.configure();
        logger.info("This is my first log4j's statement");

	}

}
