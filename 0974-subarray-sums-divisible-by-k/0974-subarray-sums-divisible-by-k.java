class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            cnt+=map.getOrDefault(((sum%k)+k)%k,0);
            map.put(((sum%k)+k)%k,map.getOrDefault(((sum%k)+k)%k,0)+1);
        }
        return cnt;
        
    }
}