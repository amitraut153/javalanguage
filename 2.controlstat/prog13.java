//Print reverse digits of the given integer
class While6{
	public static void main(String[]args){
		int N=6531;

		while(N != 0){
			
			System.out.println(N%10);
			N=N/10;
		}
	}
}
