import java.util.Arrays;
class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return " ";
        }
        Arrays.sort(strs);
        int i=0;
        String first=strs[0];
        String last=strs[strs.length-1];
        while(i<first.length()&& i<last.length()&&first.substring(i,i+1).compareTo(last.substring(i,i+1))==0){
            i++;
        }
        return first.substring(0, i);
    }
}