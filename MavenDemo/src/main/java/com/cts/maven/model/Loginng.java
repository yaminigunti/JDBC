package com.cts.maven.model;

import org.apache.log4j.Logger;

public class Loginng {
	static Logger logger = Logger.getLogger(Loginng.class);
    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file

 
        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
        logger.debug("hello");
        System.out.println("hello");
    }

}
