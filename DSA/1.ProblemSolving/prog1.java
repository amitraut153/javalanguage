//factor code optimization
import java.util.*;
class FindFactor{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int itr=0;
		int count=0;
		for(int i=1; i<=N; i++){
			itr++;
			if(N%i==0)
				count++;
		}
		System.out.println(itr);
		System.out.println(count);
	}
}
