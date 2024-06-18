import java.util.*;
class ArrayDemo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int prod=1;
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter elements of an array: ");

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();

			if(arr[i]%2==0){
				prod=prod*arr[i];
			}
		}
		System.out.println("Product of odd integer is "+prod);
	}
}
