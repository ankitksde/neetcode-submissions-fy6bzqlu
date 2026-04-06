class Solution {
    public boolean isAnagram(String s, String t) {
        int ns=s.length();
        int nt=t.length();
        if(ns!=nt) return false;
        int[] freq= new int[26];
        for(int i=0;i<ns;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<nt;i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
