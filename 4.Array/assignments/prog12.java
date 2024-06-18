import java.util.*;
class CommonEle{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array: ");
		int size=sc.nextInt();
		System.out.println("Enter size of 2nd array: ");
		int size2=sc.nextInt();

		int arr1[]=new int[size];
		int arr2[]=new int[size2];

		System.out.println("Enter elements of 1st array: ");
		for(int i=0; i<arr1.length; i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 2nd array: ");
		for(int i=0; i<arr2.length; i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println("Common elements between two arrays: ");
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){		
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
