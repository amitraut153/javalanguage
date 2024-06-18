import java.util.*;
class ArrayDemo6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;

		System.out.println ("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum is= "+sum);
	}
}

