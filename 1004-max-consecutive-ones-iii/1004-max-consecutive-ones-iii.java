class Solution {
    public int longestOnes(int[] nums, int k) {
        int o = 0;
        int z = 0;
        int cnt = 0;
        int left = 0,right = 0;
        int id = 0;
        while(right<nums.length){
            int n = nums[right];
            if(n==1){
                o++;
            }else if(n==0){
                z++;
            }
            while(z>k){
                if(nums[left]==1){
                    o--;
                }else{
                    z--;
                }
                left++;
            }
            cnt=Math.max(cnt,right-left+1);
            right++;
        }
        cnt=Math.max(cnt,o+z);
        return cnt;
        
    }
}