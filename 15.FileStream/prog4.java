import java.io.*;

class FileDemo{
	public  static void main(String[]args){
		File fobj=new File("/home/amitraut/javalanguage/15.FileStream");

		System.out.println(fobj.exists());
		String[] files=fobj.list();

		for(String str:files){
			System.out.println(str);
		}
	}
}

