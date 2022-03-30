package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globaldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties pro=new Properties();
		FileInputStream istr=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspacePathan\\introduction\\src\\introduction\\data.properties");
		pro.load(istr);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		
	      pro.setProperty("browser", "firefox");
	      pro.setProperty("url", "https://rahulshettyacademy.com");
	      System.out.println(pro.getProperty("browser"));
	      System.out.println(pro.getProperty("url"));
		FileOutputStream outp=new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspacePathan\\introduction\\src\\introduction\\data.properties");
	    pro.store(outp, null);
	   System.out.println(pro.getProperty("browser"));
	    
	}

}
