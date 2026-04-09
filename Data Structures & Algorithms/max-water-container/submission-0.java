class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int currentArea=Math.min(heights[i],heights[j])*(j-i);
                maxArea=Math.max(currentArea,maxArea);
            }
        }
        return maxArea;
    }
}
