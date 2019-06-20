package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestLogger 
{
	
	 final static Logger logger = Logger.getLogger(TestLogger.class);
	 public void callMeInAppInfo(String parameter) {
	  if (logger.isInfoEnabled()) {
	   logger.info("This is info : " + parameter);
	  }
	 }
	 public void callMeInAppWarn(String parameter) {
	  if (logger.isWarnEnabled()) {
	   logger.warn("This is warn : " + parameter);
	  }
	 }
	 public void callMeInAppDebug(String parameter) {
	  if (logger.isDebugEnabled()) {
	   logger.debug("This is Debug : " + parameter);
	  }
	 }
	 public void callMeInAppError(String parameter) {
	  if (logger.isErrorEnabled()) {
	   logger.error("This is error : " + parameter);
	  }
	 }
	 /*public void callMeInAppFatal(String parameter) {
	  if(logger.isFatalEnabled()) {
	   logger.fatal("This is fatal : " + parameter);
	  }
	 }*/
	public static void main(String[] args) 
	{
		BasicConfigurator.configure();
		TestLogger objLog4JCoreJavaSample = new TestLogger();
		  objLog4JCoreJavaSample.callMeInAppInfo("Log4JCoreJavaSample by Info");
		  objLog4JCoreJavaSample.callMeInAppWarn("Log4JCoreJavaSample by Warn");
		  objLog4JCoreJavaSample.callMeInAppDebug("Log4JCoreJavaSample by Debug");
		  objLog4JCoreJavaSample.callMeInAppError("Log4JCoreJavaSample by Error");
		 // objLog4JCoreJavaSample.callMeInAppFatal("Log4JCoreJavaSample by Fatal");	
	}

}
