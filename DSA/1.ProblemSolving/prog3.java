import java.util.*;

class FindFactor{
	static int Factors(int num){
		int count=0;
		int itr=0;
		for(int i=1; i<=num/2; i++){
			itr++;
			if(num%i==0){
				count++;
			}
		}
		System.out.println("number of Iterations are= "+itr);
		return count+1;
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value:");
		int num=sc.nextInt();
		int count=Factors(num);

		System.out.println("No of factors count are= "+count);
	}
}
