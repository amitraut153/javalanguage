import java.util.*;
class ArrayDemo6{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		int sum=0;

		int arr[]=new int [5];
		System.out.println("Enter Five elements: ");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum is: "+sum);
	}
}
