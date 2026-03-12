class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;                     // start of window
        int sum = 0;                      // current window sum
        int minLen = Integer.MAX_VALUE;   // store minimum length

        for(int right = 0; right < nums.length; right++){

            sum += nums[right];           // expand window

            while(sum >= target){         // condition satisfied

                minLen = Math.min(minLen, right - left + 1);

                sum -= nums[left];        // shrink window
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE)
            return 0;

        return minLen;
    }
}