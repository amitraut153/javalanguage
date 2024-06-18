//Day1
//EasyLevel
//code 1:Single Number
//leetCode 136

class Solution {
    public static int singleNumber(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = { 4,1,2,1,2 };

        int data = singleNumber(arr);
        System.out.println(data);
    }
}
