class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[][] arr= new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int left=0;
        int right=n-1;
        int[] result=new int[]{-1,-1};
        while(left<right){
            if(arr[left][0]+arr[right][0]==target){
                result[0]=arr[left][1]<arr[right][1]?arr[left][1]:arr[right][1];
                result[1]=arr[left][1]<arr[right][1]?arr[right][1]:arr[left][1];
                return result;
            }else if(arr[left][0]+arr[right][0]<target) left++;
            else right--;
        }
        return result;
    }
}
