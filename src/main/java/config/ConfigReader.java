package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    // Static block: ক্লাসটা কল হওয়ার সাথে সাথেই ফাইলটা মেমোরিতে লোড হয়ে যাবে
    static {
        try {
            // আপনার config.properties ফাইলের লোকেশন
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

    // এই মেথড দিয়ে আমরা যেকোনো ডেটা চাবো (যেমন: getProperty("baseUrl"))
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}