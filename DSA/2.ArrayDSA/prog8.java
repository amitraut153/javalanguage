import java.util.*;
class ArrayDemo{
	public static void main(String[]args){
		int arr[]=new int[]{2,5,3,11,7,9,4};
		int  N=7;
		Scanner sc=new Scanner(System.in);

		int startIndex=sc.nextInt();
		int endIndex=sc.nextInt();
		int sum=0;
		for(int i=startIndex; i<=endIndex; i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
