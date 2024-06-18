//import java.util.*;
import java.io.*;
class IO2{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Name:");
		String name1=br.readLine();

		System.out.println("Enter jerNo");
		int jerNo=Integer.parseInt(br.readLine());

		System.out.println("Enter Average");
		float avg=Float.parseFloat(br.readLine());

		System.out.println("Enter Group");
		char group=(char)br.read();

		System.out.println("Player Name= "+ name1);
		System.out.println("Jercy No= "+ jerNo);
		System.out.println("Average= "+ avg);
		System.out.println("Group= "+group);

	}
}



