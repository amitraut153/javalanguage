class NFor25{
	public static void main(String[]args){
		int N=10;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4-i+1; j++){
				System.out.print(N +" ");
			}
			N++;
			System.out.println();
		}
	}
}
