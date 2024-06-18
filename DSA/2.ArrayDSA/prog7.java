//code of 2nd largest elements of the array list

class ArrayLarge{
	public static void main(String[]args){
		int arr[]=new int[]{8,4,1,3,9,2,6,7};
		int N=8;
		
		int maxEle=Integer.MIN_VALUE;
		for(int i=0; i<N; i++){
			if(arr[i]>maxEle){
				maxEle=arr[i];	
			}
		}
		
		System.out.println(maxEle);
	}
}
