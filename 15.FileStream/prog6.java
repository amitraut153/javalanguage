import java.io.*;
class FileDemo{

	public static void main(String[]args)throws IOException{

		File f=new File("Incubator.txt");
		FileWriter fw=new FileWriter(f,false);

		fw.write("Testing\n");
		fw.write("Devops\n");
		fw.write("Salesforce\n");

		fw.close();
	}
}
