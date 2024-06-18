//Print sum of every single subarray using Prefix Sum technique

class PrefixSum{
	public static void main(String[]args){
		int arr[]=new int[]{2,4,1,3};
		int prefixSum[]=new int [arr.length];
		
		prefixSum[0]=arr[0];
		for(int i=1; i<arr.length; i++){
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}

		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int sum=0;
				if(i==0)
					sum=prefixSum[j];
				else
					sum=prefixSum[j]-prefixSum[i-1];

				System.out.println(sum);
			}
		}
	}
}
