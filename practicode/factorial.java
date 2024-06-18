//factorial===6=6*5*4*3*2*1=720

import java.io.*;
public class factorial{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number for calculate factorial:");
		int N=Integer.parseInt(br.readLine());
		int temp=N;
		int fact=1;

		for(int i=1; i<=N; i++){
			
			fact=fact*i;
		}

		System.out.println("Factorial of "+temp+" is "+fact);
	}
}
