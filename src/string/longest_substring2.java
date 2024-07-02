package string;

import java.util.HashSet;

public class longest_substring2 {
    static int longestSubstring(String s){
        int n = s.length();
        int max_len = 0;
        for(int i=0;i<n;i++){
            int len = 0;
            HashSet<Character> hs = new HashSet<>();
            for(int j=i;j<n;j++){
                if(hs.contains(s.charAt(j))== false ){
                    hs.add(s.charAt(j));
                    len++;
                }
                else{
                    break;
                }
            }
            max_len = Math.max(max_len, len);
        }
        return max_len;
    }
    public static void main(String[] args) {
        String str = "abaceafe";
        System.out.println( longestSubstring(str) );
    }
}
