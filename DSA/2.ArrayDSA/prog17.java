class Lowercase2{
	public static void main(String[]args){
		int arr[]=new int[]{'b','a','a','a','c','g','g','g'};
		int N=8;
		int count=0;

		for(int i=0; i<N; i++){
			if(arr[i]=='a'){
				for(int j =i+1; j<N; j++){
					if(arr[j]=='g')
						count++;
				}
			}
		}System.out.println(count);
	}
}
