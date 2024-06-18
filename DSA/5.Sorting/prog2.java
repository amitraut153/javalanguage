class BubbleSort{
	public static void main(String[]args){
		int arr[]=new int[]{2,3,4,5,9,7};
		//int arr[]=new int[]{2,3,4,5,7,9};
		int count=0;
		boolean swapped;

		for(int i=0; i<arr.length; i++){

			swapped=false;
			for(int j=0; j<arr.length-1; j++){
				count++;
				
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				}
			}
			if(swapped==false)
				break;
		}
		System.out.println("Count is:"+count);
		for(int i=0;i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}


