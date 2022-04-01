package co.uk.zoopla.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public String getPropertiesParameter(String prop) throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/test/java/co/uk/zoopla/Utility/Config.properties");
        properties.load(inputStream);
        return  properties.getProperty(prop);

    }
}
