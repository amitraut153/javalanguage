import java.util.*;

class RangeSum2{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{4,3,2};
		for(int i=1; i<arr.length; i++){
			arr[i]=arr[i-1]+arr[i];
		}

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
