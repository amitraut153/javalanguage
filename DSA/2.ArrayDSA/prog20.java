//write a code to count sub-array of the given arraylist

class Subarray{
	public static void main(String[]args){
		int arr[]=new int []{4,2,10,3,12,-2,15};
		int N=7;
		int count=0;

		for(int i=0; i<N; i++){
			for(int j=0; j<arr.length; j++){
				count++;
			}
		}
		System.out.println(count);
	}
}
