package test;

import org.apache.log4j.Logger;

public class TestMainClass {

    private static final Logger LOGGER = Logger.getRootLogger();


    public static void main(String[] args) {

        try {
            System.out.println("sdasa");

        } catch (Exception e) {
            LOGGER.error("ERROR!!!!!!!!!!");
        }

    }

}
