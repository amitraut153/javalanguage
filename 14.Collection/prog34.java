//Properties
import java.util.*;
import java.io.*;

class PropertiesDemo{
	public static void main(String[]args)throws IOException,FileNotFoundException{
		Properties obj=new Properties();

		FileInputStream fobj=new FileInputStream("Friends.properties");

		obj.load(fobj);

		String name=obj.getProperty("Amit");
		System.out.println(name);

		obj.setProperty("Akshu","Bienscap");

		FileOutputStream outobj=new FileOutputStream("Friends.properties");
		obj.store(outobj,"Updated by Amit");
	}
}
