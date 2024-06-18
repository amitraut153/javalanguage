//Optimize code
class LeftMax{
	public static void main(String[]args){
		int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};

		int N=10;
		int leftMax[]=new int[N];

		leftMax[0]=arr[0];

		for(int i=1; i<N; i++){
			if(leftMax[i-1]<arr[i])
				leftMax[i]=arr[i];
			else
				leftMax[i]=leftMax[i-1];
		}

		for(int i=0; i<N; i++){
			System.out.print(leftMax[i]+" ");
		}
			System.out.println();
	}
}
