package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Test {
	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
			props.load(in);
			
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);
	}
}