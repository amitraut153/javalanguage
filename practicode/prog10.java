class SumOfDigit{
	int sum=0;
	
	int fun(int num){
		
		for(; num!=0; ){
			int ret=num%10;
			sum=sum+ret;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[]args){
		
		System.out.println("Start main");
		SumOfDigit obj=new SumOfDigit();
		int sumOf=obj.fun(654);
		System.out.println(sumOf);
		System.out.println("End main");
	}
}

