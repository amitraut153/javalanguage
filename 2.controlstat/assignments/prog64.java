class NFor34{
	public static void main(String[]args){
		int rows=4;
		
		for(int i=1; i<=4; i++){
			int temp=i;
			for(int j=1; j<=rows-i+1; j++){
				System.out.print(temp +" ");
				temp++;
			}
			System.out.println();
		}
	}
}

