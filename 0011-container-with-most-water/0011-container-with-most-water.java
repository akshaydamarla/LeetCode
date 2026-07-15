class Solution {
    public int maxArea(int[] height) {
        int i = 0,j=height.length-1;
        int a = 0;
        int ma = 0;
        while(i<j){
            a = (j-i)*Math.min(height[i],height[j]);
            ma = Math.max(a,ma);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        ma = Math.max(a,ma);
        return ma;
    }
}