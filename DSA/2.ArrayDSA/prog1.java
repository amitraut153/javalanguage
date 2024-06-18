//Print all elements of the array

class ArrayDemo{
	public static void main(String[]args){
		int arr[]=new int []{5,6,2,3,1,9};
		int N=6;		
		for(int i=0; i<N; i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
		/*for(int j=N-1; j>=0; j--){
			System.out.print(" "+arr[j]);
		}
		System.out.println(" ");
		*/
	}
}
