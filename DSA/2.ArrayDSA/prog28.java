/* Kadanes Algorithm
 1) sum=sum+array
 2) maxSum=sum;  if(maxSum<sum)
 3) if sum<0 , sum=0
*/

class KadanesAlgo{
	public static void main(String[]args){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int maxSum=Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];

			if(sum>maxSum)
				maxSum=sum;
			if(sum<0)
				sum=0;
		}
		System.out.println(maxSum);
	}
}



