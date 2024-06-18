class NFor35{
	public static void main(String[]args){
		int rows=4;
		char ch='A';
		for(int i=1; i<=rows; i++){
			char temp = ch;
			for(int j=1; j<=rows-i+1; j++){
				System.out.print(temp +" ");
				temp++;
			}
			ch++;
			System.out.println();
		}
	}
}

