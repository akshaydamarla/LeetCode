class Solution {
    public int findClosestNumber(int[] nums) {
        int close = nums[0];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(close)){
                close = nums[i];
            }
            if(Math.abs(close)==Math.abs(nums[i])){
                close = Math.max(close,nums[i]);
            }
        }
        return close;
        
    }
}