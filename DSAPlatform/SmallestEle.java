//GFG--=Find the smallest element and second smallest elements in an array

class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        Arrays.sort(a);
        long min=0;
        long min_sec=0;
        
        min=a[0];
        
        for(int i=0; i<n-1; i++){
            
            if(a[i] != a[i+1]){
                
                min_sec=a[i+1];
                break;
            }
        }
        
        if(min_sec==0){
            return new long[]{-1};
        }
        
        long []arr={min,min_sec};
        return arr;
    }
}
