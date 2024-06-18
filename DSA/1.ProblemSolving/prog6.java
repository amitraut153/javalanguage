import java.util.*;
class SquareRoot{
	static int Sqrt(int num){
		int start=1;
		int end=num;
		int ans=0;
		int itr=0;
		
		while(start <=end){
			itr++;
			int mid=(start + end)/2;
			int sqr=mid*mid;
			if(sqr==num){
				System.out.println(itr);
				return mid;
			}
			if(sqr>num){
				end=mid-1;
			}
			else{
				ans=mid;
				start=mid+1;
			}
		}
		System.out.println(itr);
		return ans;
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ret=Sqrt(num);

		System.out.println(ret);
		
	}
}
