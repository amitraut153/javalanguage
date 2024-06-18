//Armstrong Number
class For8{
	public static void main(String[]args){
		int N=153;
		int temp1=N;
		int temp2=N;
		int count=0;
		while(temp1 !=0){
			count++;
			temp1=temp1/10;
		}
		int sum=0;
		while(N!=0){
			int rem=N%10;
			int mult=1;
			for(int i=1; i<=count; i++){
				mult=mult*rem;
			}
			sum=sum+mult;
			N=N/10;
		}

		if(temp2 == sum){
			System.out.println("Armstrong Num");
		}
		else
			System.out.println("Not Armstrong");
	}
}

