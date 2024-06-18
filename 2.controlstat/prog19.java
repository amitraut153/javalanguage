class While12{
	public static void main(String[]args){
		int N=2332;
		int rev=0;
		int temp=rev;

		while(N != 0){
			int rem=N%10;
			rev=rev*10;
			N=N/10;
		}
		if(temp == rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}
}
