package PropConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertyFile {
    protected static FileInputStream FIS;
    protected static  Properties prop;
    public static String get(String key) throws IOException {
        File file = new File(System.getProperty("user.dir")+"/resources/config.properties");
        FIS=new FileInputStream(file);
        prop=new Properties();
        prop.load(FIS);

        try {
              return prop.getProperty(key);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }


}
