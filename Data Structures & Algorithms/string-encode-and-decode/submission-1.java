class Solution {

    public String encode(List<String> strs) {
        int n=strs.size();
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append(',');
        }
        sb.append('#');
        for(String str:strs){
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result= new ArrayList<>();
        List<Integer> sizes= new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder sb=new StringBuilder();
            int j=i;
            while(str.charAt(j)!=','){
                sb.append(str.charAt(j));
                j++;
            }
            sizes.add(Integer.parseInt(sb.toString()));
            i=j+1;
        }
        i++;
        for(int size: sizes){
            result.add(str.substring(i,i+size));
            i+=size;
        }
        return result;
    }
}
