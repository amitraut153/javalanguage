// Print the boundary in clockwise fashion


class BoundaryClockArray{
	public static void main(String[]args){

		//int arr[][]=new int [][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int arr[][]=new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		int i=0,j=0,N=arr[0].length;
		for(int x=0; x<N-1; x++){
			System.out.print(arr[i][j]+" ");
			j++;
		}
		
		for(int x=0; x<N-1; x++){
			System.out.print(arr[i][j]+" ");
			i++;
		}
		
		for(int x=0; x<N-1; x++){
			System.out.print(arr[i][j]+" ");
			j--;
		}
		
		for(int x=0; x<N-1; x++){
			System.out.print(arr[i][j]+" ");
			i--;
		}
		
	}
}
		
