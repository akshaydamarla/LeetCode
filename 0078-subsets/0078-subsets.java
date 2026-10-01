class Solution {
    static boolean check(int n, int i){
        if(((n>>i)&1)==0){
            return false;
        }
        return true;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(check(i,j)){
                    temp.add(nums[j]);
                }
            }
            res.add(temp);
        }
        return res;
        
    }
}