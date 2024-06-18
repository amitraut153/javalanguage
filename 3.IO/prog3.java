//import java.util.*;
import java.io.*;
class FlatDemo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Name:");
		String name=br.readLine();

		System.out.println("Enter your wing");
		char wing=(char)br.read();
		br.skip(1);
		System.out.println("Enter your flatNo:");
		int flatNo=Integer.parseInt(br.readLine());

		System.out.println("Name= "+ name);
		System.out.println("Wing= "+wing);
		System.out.println("FlatNo= "+flatNo);

	}
}
