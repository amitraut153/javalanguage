import java.util.*;
class MinEle{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter elements of an array: ");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();

		}

		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Min elements= "+min);
	}
}
