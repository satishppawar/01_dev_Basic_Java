package example.demo.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesConfigurationExample {
    static Logger logger = Logger.getLogger(Log4jPropertiesConfigurationExample.class);
    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("./src/main/resources/log4j.properties");
        
 
        //Log in console in and log file
        logger.info("Log4j appender configuration is successful !!");
    }

}
