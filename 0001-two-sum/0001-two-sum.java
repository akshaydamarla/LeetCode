class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int dif = target - nums[i];
            res[0]=i;
            if(map.containsKey(dif)){
                res[1]=map.get(dif);
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
        
    }
}