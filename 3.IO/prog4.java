import java.io.*;
import java.util.*;
class IO4{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Society Name,wing,FlatNo");
		String info=br.readLine();

		System.out.println(info);

		StringTokenizer obj=new StringTokenizer(info, " ");

		String token1=obj.nextToken();
		String token2=obj.nextToken();
		String token3=obj.nextToken();

		System.out.println("Society = "+token1);
		System.out.println("wing = "+token2);
		System.out.println("flatNo = "+token3);
	}
}


