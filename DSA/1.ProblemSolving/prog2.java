import java.util.*;

class FindFactor{
	static int Factors(int num){
		int count=0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				count++;
			}
		}
		return count;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();
		int count=Factors(num);

		System.out.println(count);
	}
}
