package ReadPropertiesFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\sbhutkar\\eclipse-workspace\\ReadPropertiesFile\\src\\PropertiesFile\\PropertiesFile.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("website"));
	}

}
//remember we create FileReader and Properties objects and then load file and get property.
//for write use FileWriter object and set property at last.