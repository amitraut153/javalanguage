class NFor40{
	public static void main(String[]args){
		int rows=4;
		int N=1;
		for(int i=1; i<=rows; i++){
			int temp=N;
			for(int j=1; j<=i; j++){
				if(j%2==0){
					System.out.print(temp*temp + " ");
				}
				else{
					System.out.print(temp*temp*temp + " ");
				}
				temp++;
			}
			N++;
			System.out.println();
		}
	}
}
