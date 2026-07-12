class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sor = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sor[i]=(arr[i]);
        }
        Arrays.sort(sor);
        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(sor[i])){
                map.put(sor[i],rank++);
            }
        }
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
        
    }
}