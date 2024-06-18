class NFor22{
	public static void main(String[]args){
		int row=4;
		int N=1;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				System.out.print(N++ +" ");
			}
			System.out.println();
		}
	}
}
