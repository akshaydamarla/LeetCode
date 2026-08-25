class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> freq = new ArrayList<>();
        for(int key:map.keySet()){
            freq.add(map.get(key));
        }
        int id=0;
        int[] res = new int[k];
        Collections.sort(freq);
        for(int i=freq.size()-1;i>=freq.size()-k;i--){
            for(int key:map.keySet()){
                if(map.get(key)==freq.get(i)){
                    res[id++]=key;
                    map.remove(key);
                    break;
                }
            }
        }
        return res;
    }
}