//Print all the subarrays

class Subarray{
	public static void main(String[]args){
		int arr[]=new int[]{2,4,1,3};
		int N=arr.length;

		for(int i=0; i<N; i++){
			for(int j=i; j<N; j++){
				for(int k=i; k<=j; k++){
					System.out.print(arr[j]+"  ");
				}
				System.out.println();
			}
		}
	}
}
