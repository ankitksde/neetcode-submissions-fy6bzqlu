class Solution {

    public String encode(List<String> strs) {
        int n=strs.size();
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int size=Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+size;
            result.add(str.substring(i,j));
            i=j;
        }
        return result;
    }
}
