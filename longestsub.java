class Solution {
    public int longestSubarray(int[] nums) {
        int cnt = 0;   // count of zeros
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) cnt++;

            while (cnt > 1) {
                if (nums[i] == 0) cnt--;
                i++;
            }

            // j - i because we must delete one element
            maxLen = Math.max(maxLen, j - i);
        }

        return maxLen;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int[] nums = {1,1,0,1,1,1}; 
        System.out.println(sol.longestSubarray(nums)); // Output: 3
    }
}
