class ArrayDe{
	public static void main(String[]args){

		int arr[]=new int[]{8,4,1,3,9,2,6,7};
		int N=8;
		int i=0;
		int j=N-1;
		int sum=0;
		while(i<=j){
			sum=arr[i]+arr[j];
			i++;
			j--;
		}
		System.out.println(sum);

	}
}
