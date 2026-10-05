class Solution {
    public int longestSubarray(int[] nums) {
        int ocnt = 0;
        int zcnt = 0;
        int maxCnt = 0;
        int left = 0,right = 0;
        while(right<nums.length){
            int n = nums[right];
            if(n==1){
                ocnt++;
            }else{
                zcnt++;
            }
            while(zcnt>1){
                if(nums[left]==1){
                    ocnt--;
                }else{
                    zcnt--;
                }
                left++;
            }
            maxCnt=Math.max(maxCnt,right-left);
            right++;
        }
        return maxCnt;
    }
}