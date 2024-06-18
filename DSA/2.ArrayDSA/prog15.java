//Built an array rightmax of size N;

class RightMax{
	public static void main(String[]args){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N=10;
		int rightMax[]=new int[N];
		rightMax[N]=arr[N];
		for(int i=N-1; i>=0; i--){
			if(rightMax[i+1]< arr[i])
				rightMax[i]=arr[i];
			else
				rightMax[i]=rightMax[i+1];
		}

		for(int i=0; i<N; i++){
			System.out.println(rightMax[i]+" ");
		}
	}
}	//error
