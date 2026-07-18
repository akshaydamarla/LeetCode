class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0],max = nums[0];
        for(int i=1;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(nums[i],max);
        }
        int res = 0;
        for(int i=min;i>=1;i--){
            if(max%i==0&&min%i==0){
                return i;
            }
        }
        return min;
        
    }
}