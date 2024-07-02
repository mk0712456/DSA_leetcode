package string;

import java.util.HashMap;

public class permutations_or_not {
    static boolean match(String s1, String s2, int n, int m){
        if(n!=m){
            return false;
        }
        int count =0;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s1.charAt(i);
            if(hm1.containsKey(ch)){
                int x = hm1.get(ch);
                hm1.put(ch, x+1);
            }
            else{
                hm1.put(ch, 1);
            }
        }
        for(int i=0;i<m;i++){
            char ch = s2.charAt(i);
            if(hm2.containsKey(ch)){
                int x = hm2.get(ch);
                hm2.put(ch, x+1);
            }
            else{
                hm2.put(ch, 1);
            }
            if(hm1.containsKey(ch) && hm2.get(ch)<=hm1.get(ch)){
                count++;
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "anat";
        String s2 = "tanaa";
        System.out.println(match(s1, s2, s1.length(), s2.length()));
    }
}
