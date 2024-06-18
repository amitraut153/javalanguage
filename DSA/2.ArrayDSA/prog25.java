//Print sum of every single subarray using Prefix Sum technique

class PrefixSum{
	public static void main(String[]args){
		int arr[]=new int[]{2,4,1,3};
		int prefixSum[]=new int [arr.length];
		int totleSum=0;
		for(int i=0; i<arr.length; i++){
			int sum=0; 
			for(int j=i; j<arr.length; j++){
				sum=sum+arr[j];
				System.out.println(sum);
				totleSum=totleSum+sum;

			}
		}
		System.out.println("totleSum is: "+totleSum);
	}
}
