import java.util.*;
class Demo4{
	static void add(int a,int b){
		int add=a+b;
		System.out.println("addition= "+ add);
	}
	static void mult(int a,int b){
		int mult=a*b;
		System.out.println("Multiplication= "+mult);
	}
	static void sub(int a, int b){
		int sub=a-b;
		System.out.println("Subtraction= "+sub);
	}
	static void div(int a,int b){
		int div=a/b;
		System.out.println("Division= "+div);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a==");
		int a=sc.nextInt();
		System.out.println("Enter value of b==");
		int b=sc.nextInt();

		add(a,b);
		sub(a,b);
		mult(a,b);
		div(a,b);
	}
}
