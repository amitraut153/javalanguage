// 26/11/23 Lec-74
import java.io.*;
class Demo{

	void getData()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int data=0;
		try{
				data=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException obj){
			System.out.println("Sapdle exception");
		}

		System.out.println(data);
	}

	public static void main(String[]args)throws IOException{
		Demo obj1=new Demo();
		obj1.getData();
	}
}
