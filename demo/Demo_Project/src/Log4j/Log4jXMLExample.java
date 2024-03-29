package Log4j;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jXMLExample
{
	static Logger logger = Logger.getLogger(Log4jXMLExample.class);
	public static void main(String[] args)
	{
		String log4jConfigFile = System.getProperty("user.dir")
                + File.separator + "log4j.xml";
        DOMConfigurator.configure(log4jConfigFile);
 
        logger.debug("this is a debug log message");
        logger.info("this is a information log message");
        logger.warn("this is a warning log message");

	}

}
