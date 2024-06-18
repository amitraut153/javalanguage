//Methods of File(javap java.io.File)
import java.io.*;

class FileMethods{
	public static void main(String[]args){
		File fobj1=new File("Incubator");
		try{
			fobj1.createNewFile();
		}catch(IOException obj){
			
		}

		System.out.println(fobj1.getName()); 	//Incubator.txt
		
		System.out.println(fobj1.getParent());	//null
		
		System.out.println(fobj1.getPath());
		
		System.out.println(fobj1.getAbsolutePath());	//whole path
		
		System.out.println(fobj1.canRead());	//true
		
		System.out.println(fobj1.canWrite());	//true
		
		System.out.println(fobj1.isDirectory());//false
		
		System.out.println(fobj1.isFile());	//true

	}
}
