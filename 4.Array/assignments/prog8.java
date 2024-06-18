import java.util.*;
class ArrayDemo8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		int EvenSum=0;
		int OddSum=0;

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				EvenSum=EvenSum+arr[i];
			}
			else{
				OddSum=OddSum+arr[i];
			}	
		}
		System.out.println("Even Numbers sum: "+EvenSum);
		System.out.println("Odd Numbers sum: "+OddSum);
	}
}
