class For8{
	public static void main(String[]args){
		int N=23;
		int sum=0;
		int temp=N;

		for(int i=1; i<=N; i++){
			int rem=N%10;
			sum=sum+(rem*rem*rem);
			N=N/10;
			i--;
		}
		if(temp==sum){
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not Armstrong");
	}
}
