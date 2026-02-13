class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int head = 0;
        int tail = n - 1;

        for (int pos = n - 1; pos >= 0; pos--) {

            if (Math.abs(nums[head]) > Math.abs(nums[tail])) {
                result[pos] = nums[head] * nums[head];
                head++;
            } else {
                result[pos] = nums[tail] * nums[tail];
                tail--;
            }
        }

        return result;
    }
}
