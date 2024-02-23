package genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class fatchdata {
	public String readdata(String key ) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Chatla Nikitha\\eclipse\\selenium\\credential.properties");
		Properties p = new Properties();
		p.load(fis);
String	value	= p.getProperty(key);
		 return value;
	}
}
