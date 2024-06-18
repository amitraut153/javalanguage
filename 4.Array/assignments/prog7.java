import java.util.*;
class ArrayDemo7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		int EvenCount=0;
		int OddCount=0;

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				EvenCount++;
			}
			else{
				OddCount++;
			}	
		}
		System.out.println("Numbers of Even elements: "+EvenCount);
		System.out.println("Numbers of Odd elements: "+OddCount);
	}
}

