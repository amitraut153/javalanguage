/*
Reverse the array without using extra space
space complexity :O(1)
*/

class ArrayRev{
	public static void main(String[]args){
		int arr[]=new int[]{8,4,1,3,9,2,6,7};
		int N=8;
		int i=0;
		int j=N-1;

		while(i<=j){
			
			System.out.println(arr[j]);
			j--;
		}
		
	}
}

