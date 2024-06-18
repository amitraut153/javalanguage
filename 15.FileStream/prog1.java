import java.io.*;

class FileDemo{
	public static void main(String[]args)throws IOException{
		File fobj=new File("Core2web.txt");

		fobj.createNewFile();	//file create
	}
}
