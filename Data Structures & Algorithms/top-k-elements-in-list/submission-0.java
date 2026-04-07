class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm= new HashMap<>();
        for(int num: nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(hm.entrySet());
        Collections.sort(list, (a,b)->b.getValue()-a.getValue());
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }
        return result;
    }
}
