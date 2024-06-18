//File Description

import java.io.*;
class FileDesDemo{
	public static void main(String[]args)throws FileNotFoundException,IOException{

		FileInputStream fis=new FileInputStream("Amit.txt");

		FileDescriptor fd=fis.getFD();
		FileReader fr=new FileReader(fd);

		int data=fr.read();
		while(data !=-1){
			System.out.print((char)data);
			data=fr.read();
		}
		fr.close();
	}
}
