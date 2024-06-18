class NFor14{
	public static void main(String[]args){
		int N=10;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.print(N-- +" ");
			}
			System.out.println();
		}
	}
}
