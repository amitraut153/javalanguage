//GFG platform
//Logic
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    	{
        	for(int i=0; i<n; i++){
            		for(int j=i; j<n-1; j++){
                
                		if(arr[j]>arr[j+1]){
                    			int temp=arr[j];
                    			arr[j]=arr[j+1];
                    			arr[j+1]=temp;
                		}
            		}
        	}
    	}
}
