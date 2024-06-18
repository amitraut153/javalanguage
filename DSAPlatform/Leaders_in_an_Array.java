//GFG
//Leaders in an array

class Solution {
    public int majorityElement(int[] nums) {

        int length=nums.length/2;
        Map<Integer, Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])>length){
                return nums[i];
            }
        }
        return 0;
    }
}
