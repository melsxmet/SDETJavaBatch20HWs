package org.example.e198;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationFiles {
    public static void main(String[] args) throws IOException {

        String path="config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.out.print("Browser: "+properties.getProperty("browser"));
        System.out.print(" URL: "+properties.getProperty("url"));
        System.out.print(" Implicit Wait: "+properties.getProperty("implicitWait"));

    }
}
