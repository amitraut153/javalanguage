import java.util.Scanner;

class SumRenge{
	public static void main(String[]args){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N=10;
		int Q=3;
	
		int sum=0;
		for(int i=0;i<Q; i++){
			int s=0;
			int e=1;
			for(int j=s; j<=e; j++){
				sum=sum+arr[j];
			}
		System.out.println("sum:"+sum);
		}
		
	}
}

