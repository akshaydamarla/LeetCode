class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = grid.length;
        for(int i=0;i<n;i++){
            StringBuilder res = new StringBuilder("");
            for(int j=0;j<n;j++){
                res.append(grid[i][j]);
                res.append("+");
            }
            String temp = res.toString();
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int cnt = 0;

        for(int i=0;i<n;i++){
            StringBuilder res = new StringBuilder("");
            for(int j=0;j<n;j++){
                res.append(grid[j][i]);
                res.append("+");
            }
            String temp = res.toString();
            cnt+=map.getOrDefault(temp,0);
        }

        return cnt;

        
    }
}