//print multiplication of the given digits of integer value
class While8{
	public static void main(String[]args){
		int N=135;
		int multi=1;

		while(N !=0){
			int rem=N%10;
			multi=multi*rem;
			N=N/10;
		}
		System.out.println(multi);
	}
}
