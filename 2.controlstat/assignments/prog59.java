class NFor29{
	public static void main(String[]args){
		int rows=3;
		int N=1;
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=i; j++){
				System.out.print(N*N*N + " ");
				N++;
			}
			System.out.println();
		}

	}
}
