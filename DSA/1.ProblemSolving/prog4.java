import java.util.*;

class FindFactor{
	static int Factors(int num){
		int count=0;
		int itr=0;
		for(int i=1; i*i<=num/2; i++){
			itr++;
			if(num%i==0){
				count++;
			}else
				count=count+2;

		}
		System.out.println("number of Iterations are= "+itr);
		return count;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value:");
		int num=sc.nextInt();
		int count=Factors(num);

		System.out.println("No of factors count are= "+count);
	}
}
