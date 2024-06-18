import java.io.*;
class FileDemo{

	public static void main(String[]args)throws IOException{

		File fobj=new File("FileHandling");

		fobj.mkdir();	//folder create
		
		File fobj2=new File(fobj,"Code1.txt");
		fobj2.createNewFile();
	}
}
