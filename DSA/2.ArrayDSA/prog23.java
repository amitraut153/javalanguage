//Print a sum of every single subarray

class Subarray{
	public static void main(String[]args){
		int arr[]=new int[]{2,4,1,3};
		
		for(int i=0; i<arr.length; i++){

			for(int j=i; j<arr.length; j++){
				int sum=0;
				for(int k=i; k<=j; k++){
					sum=sum+arr[k];
				}
				System.out.println(sum+" ");

			}
		}
	}
}

