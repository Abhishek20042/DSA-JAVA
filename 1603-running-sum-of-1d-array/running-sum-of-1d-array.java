class Solution {
    public int[] runningSum(int[] nums) {
        int [] PS = new int[nums.length];
        PS[0] = nums[0];
        for(int i =1; i<nums.length; i++){
            PS[i]= PS[i-1]+nums[i];
        }
        return PS;
        
    }
}