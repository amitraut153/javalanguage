import java.io.*;
class ExceptionDemo{
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Stringname");
		String str=br.readLine();
		System.out.println(str);
		
		System.out.println("Enter integer value");
		int data=0;
		try{
			data=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException obj){
			System.out.println("Please Enter integer value");
			data=Integer.parseInt(br.readLine());

		}

		System.out.println(data);
	}
}

