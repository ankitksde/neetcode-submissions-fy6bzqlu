class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Set<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int maxCount=1;
        int i=0;
        for(int num:st){
            if(st.contains(num-1)) continue;
            int count=1;
            while(st.contains(num+1)){
                count++;
                num+=1;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}
