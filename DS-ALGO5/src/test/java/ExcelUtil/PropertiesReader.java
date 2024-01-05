package ExcelUtil;

import java.io.FileInputStream;
import java.util.Properties;
 
public class PropertiesReader {
	Properties prop;

	
	public Properties loadProperties () {
		try {
		FileInputStream fis = new FileInputStream ("Properties\\app.Properties");
		prop = new Properties();
		prop.load (fis);
		fis. close ();
	    return prop;
		}catch (Exception e) {
		System. out. println ("Config properties file not found");
		return null;
			}
		}
}