class Solution {
    public int longestMountain(int[] nums) {

        int n = nums.length;
        int i = 1;
        int maxLen = 0;

        while (i < n - 1) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {

                int left = i - 1;
                int right = i + 1;

                while (left > 0 && nums[left] > nums[left - 1]) left--;
                while (right < n - 1 && nums[right] > nums[right + 1]) right++;

                maxLen = Math.max(maxLen, right - left + 1);
                i = right;
            } else {
                i++;
            }
        }

        return maxLen;
    }
}