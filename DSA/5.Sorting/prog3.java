class BubbleSort{
	void bubbleSort(int arr[],int N){
		if(N==1)
			return;
		boolean swapped=false;

		for(int j=0; j<N-1; j++){
			if(arr[j]>arr[j+1]){

				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;

				swapped=true;
			}
		}
		if(swapped==false)
			return;

		bubbleSort(arr,N-1);
	}
	public static void main(String[]args){
		int arr[]=new int[]{7,3,9,4,2,5,6,7};

		BubbleSort obj=new BubbleSort();
		obj.bubbleSort(arr,arr.length);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
}

