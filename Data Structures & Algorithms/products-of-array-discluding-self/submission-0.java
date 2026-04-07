class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        int product=1;
        int zeroCount=0;
        int zeroIndex=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                zeroCount++;
                zeroIndex=i;
                continue;
            }
            product*=nums[i];
        }
        if(zeroCount>1) return output;
        if(zeroCount==1){
            output[zeroIndex]=product;
            return output;
        }
        for(int i=0;i<n;i++){
            output[i]=product/nums[i];
        }
        return output;
    }
}  
