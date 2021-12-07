package Utilites;

import org.apache.log4j.PropertyConfigurator;

import java.util.logging.Logger;

public class LoggerSetUp {

    public Logger logger;

    public void  loggerMsg(){

        logger = Logger.getLogger("PHP Travel Project");
        PropertyConfigurator.configure(FilePaths.Log4jpath);
    }


}
