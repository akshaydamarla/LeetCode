class Solution {
    public int countPartitions(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0]=nums[0];
        int ts = nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
            ts+=nums[i];
        }
        int cnt = 0;
        for(int i=0;i<nums.length-1;i++){
            int v = pre[i] - (ts-pre[i]);
            if(v%2==0){
                cnt++;
            }
        }
        return cnt;

        
    }
}