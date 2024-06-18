import java.util.*;
class Demo5{

	void sumofdigit(int x){
		int sum=0;
		while(x != 0){
			int rem= x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println("sum of digits= "+sum);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter num to calculate sum of digit: ");
		int x=sc.nextInt();
		
		Demo5 obj=new Demo5();
		obj.sumofdigit(x);
	}
}

