class Solution {
    private boolean checkAnagram(String s, String t){
        int ns=s.length();
        int nt=t.length();
        if(ns!=nt) return false;
        int[] freq= new int[26];
        for(int i=0;i<ns;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count: freq){
            if(count!=0) return false;
        }
        return true;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> result= new ArrayList<>();
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            List<String> anag= new ArrayList<>();
            anag.add(strs[i]);
            for(int j=i+1;j<n;j++){
                if(checkAnagram(strs[i],strs[j])){
                    anag.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(anag);
        }
        return result;
    }
}
