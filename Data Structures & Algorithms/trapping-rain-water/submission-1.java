class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] suffix= new int[n];
        suffix[n-1]=0;
        int result=0;
        int leftMax=0;
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i+1]);
        }
        for(int i=0;i<n;i++){
            if(i>0) leftMax=Math.max(leftMax,height[i-1]);
            if(height[i]<leftMax && height[i]<suffix[i]){
                result+=Math.min(leftMax,suffix[i])-height[i];
            }
        }
        return result;
    }
}
