class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ClosestSum= nums[0] + nums[1] + nums[2];
        for(int i = 0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int CurrentSum = nums[i] + nums[left] +nums[right];
                if(Math.abs(CurrentSum - target) < Math.abs(ClosestSum-target)){
                    ClosestSum= CurrentSum;
                }
                if(CurrentSum < target){
                    left++;
                }else if(CurrentSum > target){
                    right--;
                }else {
                    return CurrentSum;
                }
            }
        }
        return ClosestSum;
    }
        public static void main(String [] args){
            int [] nums = {-1,2,1,-4};
            int target =1;
            Solution obj = new Solution();
            int result = obj.threeSumClosest(nums, target);
            System.out.println(result);
        }
        
    }
