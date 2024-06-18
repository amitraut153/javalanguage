class JaggedArray{
	public static void main(String[]args){
		int arr[][]={{1,2,3},{4,5},{7}};

		for(int j=0; j<arr.length; j++){
			for(int i=0; i<arr[j].length ; i++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
