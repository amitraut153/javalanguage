//GFG- Even and Odd

class Solution {
    static void reArrange(int[] arr, int N) {
        int i=0;
        int j=1;
        
        while(j<N && i<N){
            if(arr[i]%2 !=0 && arr[j]%2 ==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                i=i+2;
                j=j+2;
            }
            else{
                if(arr[i]%2==0){
                    i=i+2;
                }
                if(arr[j]%2 != 0){
                    j=j+2;
                }
            }
        }
    }
};
