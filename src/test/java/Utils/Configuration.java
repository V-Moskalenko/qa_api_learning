package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Класс для поллучения данных с props.properties
 */
public class Configuration {
    public static final String CONFIGURATION_FILE = "/props.properties";
    public static final Properties properties;

    static {
        properties = new Properties();
        try (InputStream inputStream = Configuration.class.getResourceAsStream(CONFIGURATION_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file:" + CONFIGURATION_FILE, e);
        }
    }

    public static String getValue(String key) {
        return ((System.getProperty(key) == null) ? properties.getProperty(key) : System.getProperty(key));
    }
}
