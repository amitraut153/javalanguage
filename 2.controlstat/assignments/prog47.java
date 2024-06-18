// 1 2 9
// 4 25 6
// 49 8 81
class NFor17{
	public static void main(String[]args){
		int N=1;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				if(N%2 ==1){
					System.out.print(N*N+" ");
				}
				else{
					System.out.print(N+" ");
				}
				N++;
			}
			System.out.println();
		}
	}
}
