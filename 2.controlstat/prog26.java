class For7{
	public static void main(String[]args){
		int N=6;
		int sum=0;
		for(int i=1; i<6; i++){
			if(N%i==0){
				sum=sum+i;
			}
		}
		if(sum==N){
			System.out.println("Perfect number");
		}
		else
			System.out.println("Not perfect");
	}
}

