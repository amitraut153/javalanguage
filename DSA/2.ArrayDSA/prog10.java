import java.util.*;
class RengeSum{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N=10;
		int Q=3;
		int psArr[]=new int [N];
		psArr[0]=arr[0];

		for(int i=1; i<N; i++){
			psArr[i]=psArr[i-1]+arr[i];
		}
		int sum=0;
		for(int i=0;i<Q; i++){
			int startIdx=sc.nextInt();
			int endIdx=sc.nextInt();

			if(startIdx==0)
				sum=psArr[endIdx];

			else
				sum=psArr[endIdx]-psArr[startIdx-1];

			System.out.println("Sum is: "+sum);
		}
	}
}
