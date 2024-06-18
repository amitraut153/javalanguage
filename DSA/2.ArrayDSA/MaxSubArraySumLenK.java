class MaxSubArrSumLenK{

	public static void main(String[]args){

		int arr[]=new int []{-3,4,-2,5,3,-2,8,2,1,4};
		int k=4;
		int start=0;
		int end=k;
		int maxEle=Integer.MIN_VALUE;
		int sum=0;

		while(end < arr.length){
			
		//	int sum=0;
			for(int i=start; i<=end; i++){
				sum=sum+arr[i];
			}

			if(sum>maxEle){

				maxEle=sum;
			}
			start++;
			end++;
		}
		System.out.println(maxEle);
	}
}
