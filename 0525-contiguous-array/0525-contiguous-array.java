class Solution {
    public int findMaxLength(int[] nums) {
        int cnt = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt--;
            }else{
                cnt++;
            }
            if(!map.containsKey(cnt)){
                map.put(cnt,i);
            }
            if(map.containsKey(cnt)){
                maxLen = Math.max(maxLen,i-map.get(cnt));
            }
        }
        return maxLen;
        
    }
}