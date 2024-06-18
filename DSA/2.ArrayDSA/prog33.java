//Print the right square diagonal

class RightDiagonal{
	public static void main(String[]args){
		int arr[][]=new int[][]{{1,2,3},{5,6,7},{9,10,11}};
		int N=arr[0].length;
		int i=0, j=N-1;

		while(i<arr[0].length && j>=0){
			System.out.println(arr[i][j]);
			i++;
			j--;
		}
	}
}
