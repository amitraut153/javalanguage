//LeetCode-121
//Best time to buy and sell stock

class Solution {
    public int maxProfit(int[] prices) {
        
        int minValue=Integer.MAX_VALUE;
        int start=0;
        int end=0;

        for(int i=0; i<prices.length; i++){

            if(prices[i] < minValue){

                minValue=prices[i];
            }
            end=prices[i]-minValue;
            if(start < end){
                start=end;
            }
        }
        return start;
    }
}
class Client{

	public static void main(String[]args){

		int prices[]=new int[]{7,1,5,3,6,4};

		Solution obj=new Solution();
		int Start=obj.maxProfit(prices);

		System.out.println(Start);
	}
}
