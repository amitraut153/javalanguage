//FirstRepeating Element
//GFG

import java.util.HashSet;

class Solution {

    int firstRepeatingElement(int[] nums) {

        HashSet set = new HashSet();
        int number = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                number = nums[i];
                break;

            } else {
                set.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == number) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] nums = { 1,5,3,4,3,5,6 };

        Solution obj = new Solution();
        int val = obj.firstRepeatingElement(nums);

        System.out.println(val);
    }
}
