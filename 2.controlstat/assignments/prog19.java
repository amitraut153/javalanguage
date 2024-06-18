class While9{
	public static void main(String[]args){
		int N=942111423;
		System.out.println(N+" Before reverse");

		while(N!=0){
			int rem=N%10;
			System.out.print(rem);
			N=N/10;
		}
		System.out.println(" After reverse");

	}
}

