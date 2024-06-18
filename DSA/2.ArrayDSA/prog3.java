//Optimize code
class ArrayDemo{
	public static void main(String[]args){
		int arr[]=new int []{2,5,1,4,8,0,8,1,3,8};
		int count=0;
		int N=10;

		//Max
		int maxEle=Integer.MIN_VALUE;
		for(int i=0; i<N; i++){
			if(arr[i]>maxEle){
				maxEle=arr[i];
			}
		}
		//count
		for(int i=0;i<N; i++){
			if(arr[i]==maxEle)
				count++;
		}
		System.out.println(N-count);
	}
}
