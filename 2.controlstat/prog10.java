class While3{
	public static void main(String[]args){

		int N=10;
		int i=1;
		/*while(i<=N){
			System.out.println(i);
			i=i+2;
		}*/
		while(i<=N){
			if(i%2 != N){
				System.out.println(i);
				i=i+2;
			}
		}
	}
}
