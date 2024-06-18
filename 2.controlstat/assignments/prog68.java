class NFor38{
	public static void main(String[]args){
		int N=10;
		char ch='J';
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				if(i%2==1){
					System.out.print(N+" ");
				}
				else{
					System.out.print(ch+" ");
				}
				N--;
				ch--;
			}
			System.out.println();
		}
	}
}
