class NFor8{
	public static void main(String[]args){
		for(int i=1; i<=4; i++){
			int N=1;
			char ch='A';
			for(int j=1; j<=4; j++){
				if(j%2==0){
					System.out.print(N++ +" ");
				}
				else{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
}

