class Solution {
    public String longestCommonPrefix(String[] strs) {
        String First=strs[0];
        for(int i=0;i<First.length();i++){
            char current=First.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=current){
                    return First.substring(0,i);
                }
            }
        }
        return First;
    }
}