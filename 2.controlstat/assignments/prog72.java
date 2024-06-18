import java.util.Scanner;
class SwitchDemo2{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number from 0 to 5:");
		int num = sc.nextInt();

		if(num >=5){
			System.out.println("Number is greater than Five");
		}
		else if(num<0){
			System.out.println("Number is negative");
		}
		else{
			switch(num){
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
			}
		}
	}
}
