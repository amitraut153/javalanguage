//print num if it is even print reverse or if it is odd then print it also reverse but diff 2
class While7{
	public static void main(String[]args){
		int N=17;

		if(N%2==0){

			while(N!=0){
				System.out.println(N);
				N--;
			}
		}else{
			while(N>=1){
				System.out.println(N);
				N=N-2;
			}
		}
		System.out.println();
	}
}
