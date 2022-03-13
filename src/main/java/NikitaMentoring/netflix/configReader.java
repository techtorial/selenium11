package NikitaMentoring.netflix;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class configReader  {

    public static String returnKey (String key) {


        File file = new File("/Users/techtorial/Downloads/SeleniumB11/src/main/java/NikitaMentoring/netflix/Data.properties");

        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(key);

    }
}