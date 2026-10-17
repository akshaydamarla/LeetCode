class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = grid.length;
        for(int i=0;i<n;i++){
            String res = "";
            for(int j=0;j<n;j++){
                res+=grid[i][j];
                res+="+";
            }
            map.put(res,map.getOrDefault(res,0)+1);
        }
        int cnt = 0;

        for(int i=0;i<n;i++){
            String res = "";
            for(int j=0;j<n;j++){
                res+=grid[j][i];
                res+="+";
            }
            cnt+=map.getOrDefault(res,0);
        }

        return cnt;

        
    }
}