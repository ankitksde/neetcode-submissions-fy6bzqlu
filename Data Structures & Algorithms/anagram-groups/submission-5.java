class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        Map<String,List<String>> hm= new HashMap<>();
        for(String str: strs){
            char[] s=str.toCharArray();
            int[] freq=new int[26];
            for(char it:s){
                freq[it-'a']++;
            }
            String key= Arrays.toString(freq);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
