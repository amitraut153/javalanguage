class NFor33{
	public static void main(String[]args){
		int rows=4;
		int N=10;
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=i; j++){
				System.out.print(N+" ");
				N--;
			}
			N++;
			System.out.println();
		}
	}
}
