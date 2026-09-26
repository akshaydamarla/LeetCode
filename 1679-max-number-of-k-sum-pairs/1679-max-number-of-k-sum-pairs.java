class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        int i=0,j=l.size()-1;
        int cnt = 0;
        while(i<j){
            int sum = l.get(i)+l.get(j);
            if(sum==k){
                /*l.remove(i);
                l.remove(j-1);
                i=0;
                j=l.size()-1;*/
                i++;
                j--;
                cnt++;
            }else if(sum>k){
                j--;
            }else{
                i++;
            }
        }
        return cnt;
    }
}