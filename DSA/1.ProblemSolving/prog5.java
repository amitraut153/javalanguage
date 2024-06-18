import java.util.*;
class SquareRoot{
	static int Sqrt(int num){

		int val=0;
		for(int i=1; i<=num; i++){
			if(i*i==num){

				val=i;
			}
		}
		return val;
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ret=Sqrt(num);

		System.out.println(ret);
		
	}
}
