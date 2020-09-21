import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\chitra_palanisamy\\eclipse-workspace\\SeleniumProject\\src\\data1.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "Firefox");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\chitra_palanisamy\\eclipse-workspace\\SeleniumProject\\src\\data1.properties");
		prop.store(fos, null);


		System.out.println(prop.getProperty("browser"));
	}

}
