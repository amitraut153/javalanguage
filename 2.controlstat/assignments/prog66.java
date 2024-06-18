class NFor36{
	public static void main(String[]args){
		int rows=4;
		int N=1;
		for(int i=1; i<=rows; i++){
			int temp=N;
			for(int j=1; j<=i; j++){
				System.out.print(temp+" ");
				temp++;
			}
			N++;

			System.out.println();
		}
	}
}
