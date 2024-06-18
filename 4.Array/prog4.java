import java.util.*;
class ArrayDemo4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];

		System.out.println("Enter elements of an Array:");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
