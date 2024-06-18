import java.util.HashSet;

class Solution {
    boolean keypair(int[] nums, int target) {

        HashSet set = new HashSet();

        for (int i = 0; i < nums.length; i++) {

            int requred = target - nums[i];

            if (set.contains(requred)) {
                return true;
            }

            set.add(nums[i]);

        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 4, 2, 5, 1, 4 };
        int target = 7;

        Solution obj = new Solution();
        boolean val = obj.keypair(nums, target);

        System.out.println(val);
    }
}

