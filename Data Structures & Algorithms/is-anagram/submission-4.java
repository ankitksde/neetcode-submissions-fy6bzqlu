class Solution {
    public boolean isAnagram(String s, String t) {
        int ns=s.length();
        int nt=t.length();
        if(ns!=nt) return false;
        char[] sa= s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa,ta);
    }
}
