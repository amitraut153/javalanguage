import java.io.*;
import java.util.*;

class IO5{
	public static void main(String[]args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student Name,Division, RollNo,Grade");
		String info=br.readLine();

		System.out.println(info);

		StringTokenizer obj=new StringTokenizer(info," ");

		String token1=obj.nextToken();
		//char token2=token1.charAt(0);
		
		int token3=Integer.parseInt(obj.nextToken());
		float token4=Float.parseFloat(obj.nextToken());

		System.out.println("Student Name= "+token1);
		//System.out.println("Division= "+token2);
		System.out.println("RollNo= "+token3);
		System.out.println("Grade= "+token4);
	}
}

