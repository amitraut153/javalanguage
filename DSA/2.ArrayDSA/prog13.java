/* Built an array leftmax of size N
   leftmax of i contain the maximum for the index 0 to the index i

   Brute force approach
*/


class LeftmaxArray{
	public static void main(String[]args){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N=10;
		int leftMax[]=new int[N];

		for(int i=0; i<N; i++){
			int maxEle=Integer.MIN_VALUE;
			for(int j=0; j<=i; j++){
				if(maxEle<arr[j])
					maxEle=arr[j];
			}
			leftMax[i]=maxEle;
			
		}
		for(int i=0; i<N; i++){
			System.out.print(leftMax[i]+" ");
		}
		System.out.println();
	}
}
