import java.util.Scanner;
class SwitchDemo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int num1,num2;
		System.out.println("Enter two Numbers:");

		System.out.println("Enter 1st num:");
		num1=sc.nextInt();
		System.out.println("Enter 2nd num:");
		num2=sc.nextInt();
		
		if(num1<0 || num2<0){
			System.out.println("Negative Numbers not allowed");
		}
		else{
			switch(num1*num2%2){
				case(0):
					System.out.println("the multiplication is "+num1*num2+" and this num is even");
					break;
				case(1):
					System.out.println("the multiplication is "+num1*num2+" and this num is odd");
					break;
			}
		}
	}
}


		
