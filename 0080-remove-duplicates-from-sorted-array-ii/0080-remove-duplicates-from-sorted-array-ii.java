class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();


        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<3){
                result.add(nums[i]);
            }
        }

        for(int i=0;i<result.size();i++){
            nums[i]=result.get(i);
        }
        return result.size();
        

        
    }
}