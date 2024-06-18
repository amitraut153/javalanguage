import java.net.*;
import java.io.*;
import java.util.*;
class URLConnectionDemo{
	public static void main(String[]args)throws IOException{
		URL obj=new URL("https://www.google.com");
		URLConnection conn=obj.openConnection();

		System.out.println("Last modified "+new Date(conn.getLastModified()));
	}
}
