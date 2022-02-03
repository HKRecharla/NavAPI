package commonUtils;

import org.testng.internal.PropertyUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {


    /**
     * Reading property based key=value
     * Getting data based on envoronment (QA, UAT, PREPROD, STAGE)
     * @param key
     * @return
     */
    public static String geValue(String key){
        InputStream path = PropertyUtils.class
                .getClassLoader().getResourceAsStream("qa.properties");
     String value = "";
        Properties prop = new Properties();
        try {
            prop.load(path);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }




}
