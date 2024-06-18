import java.io.*;

class FileDemo{
	public static void main(String[]args)throws IOException{

		FileWriter fw=new FileWriter("Incubator.txt");

		fw.write("SpringBoot\n");
		fw.write("DevelopMent\n");
		fw.write("Flutter");
		
		fw.close();
	}
}


