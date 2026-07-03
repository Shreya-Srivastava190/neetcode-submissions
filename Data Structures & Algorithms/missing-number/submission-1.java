class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int ans = len;   // Include n

        for (int i = 0; i < len; i++) {
            ans ^= i;
            ans ^= nums[i];
        }

        return ans;
    }
}