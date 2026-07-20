class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        List<Integer> all = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                all.add(grid[i][j]);
            }
        }
        Collections.rotate(all,k);
        List<List<Integer>> result = new ArrayList<>();
        int d=0;
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(all.get(d++));
            }
            result.add(row);
        }
        System.out.println(all);
        return result;
        
    }
}