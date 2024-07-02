package string;

import java.util.HashMap;
import java.util.Map;

public class character_matching {
    public static int match(String s1, String s2, int count){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(hm1.containsKey(ch)){
                int x = hm1.get(ch);
                hm1.put(ch, x+1);
            }
            else{
                hm1.put(ch, 1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(hm2.containsKey(ch)){
                int x = hm2.get(ch);
                hm2.put(ch, x+1);
            }
            else{
                hm2.put(ch, 1);
            }
            // check the character present in hashmpa -1
            // increment by one if the freq of the curr char is less than freq of char in hm1
            if(hm1.containsKey(ch) && hm2.get(ch) <= hm1.get(ch)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s1 = "Ananada";
        String s2 = "Ananad";
        int count = 0;
        System.out.println(match(s1, s2, count));
    }
}
