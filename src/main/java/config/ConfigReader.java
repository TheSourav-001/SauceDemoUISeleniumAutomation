package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {

            String filePath = "src/test/resources/config.properties";
            FileInputStream file = new FileInputStream(filePath);

            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Config file not found in the path!");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}