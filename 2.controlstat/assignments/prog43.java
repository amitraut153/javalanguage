//14 15 16 17
//15 16 17 18
//16 17 18 19
//17 18 19 20
class NFor13{
	public static void main(String[]args){
		int N=14;
		for(int i=1; i<=4; i++){
			N=14+i-1;
			for(int j=1; j<=4; j++){
				System.out.print(N++ +" ");
			}
			//N++;
			System.out.println();
		}
	}
}
