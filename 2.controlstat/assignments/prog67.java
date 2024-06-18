class NFor37{
	public static void main(String[]args){
		int rows=6;
		int N=1;
		char ch='F';
		for(int i=1; i<=rows; i++){
			char temp=ch;
			for(int j=1; j<=i; j++){
				if(j%2==1){
					System.out.print(temp+" ");
					temp++;
				}
				else{
					System.out.print(N++ +" ");
				}
			}
			ch--;
			System.out.println();
		}
	}
}

