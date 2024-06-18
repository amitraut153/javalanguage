class TwoDArray{
	public static void main(String[]args){
		int arr[][]=new int [2][3];

		arr[0][0]=2;
		arr[0][1]=4;
		arr[0][2]=6;
		arr[1][0]=12;
		arr[1][1]=14;
		arr[1][2]=10;

		for(int[] x:arr){
			for(int y:x){
				System.out.println(y+" ");
			}
		}
		System.out.println();
	}
}
