class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            set2.add(nums1[i]);
        }
        for(int key:set){
            if(!set2.contains(key)){
                temp.add(key);
            }
        }
        for(int key:set2){
            if(!set.contains(key)){
                temp2.add(key);
            }
        }
        result.add(temp2);
        result.add(temp);
        return result;
    }
}