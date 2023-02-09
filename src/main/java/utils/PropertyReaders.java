package utils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Properties;

public class PropertyReaders
{
	static  FileReader reader;
	 private static Properties prop;
	
	 public static String init_prop(String key)
	 {
							
		try {
			reader = new FileReader("./src/test/resources/propertiesFiles/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 prop=new Properties();
		 try {
			prop.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
		return  prop.getProperty(key);
	}
}
