import java.util.*;
class ArrayDemo5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[10];

		System.out.println("Enter Elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements which are divisible by Five/5 are: ");
		for(int i=0; i<arr.length; i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]+" ");
			}
		}
	}
}

