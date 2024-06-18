/* Return the count of pairs(i,j) with arr[i]+arr[j]=k
   arr:[3,5,2,1,-3,7,8,15,6,13]
   N=10
   k=10
   Note: i != j

   output:6
*/

class ArraySize{
	public static void main(String[]args){
		int count=0;
		int N=10;
		int k=10;
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		
		int itr=0;
		for(int i=0; i<N; i++){
			int itr1=0;
			itr++;
			for(int j=i+1; j<N; j++){
		
				if(arr[i]+arr[j]==k && i != j){
					count++;
				}
			}
		
		}
		System.out.println(itr);
		System.out.println(count*2);
	}
}
