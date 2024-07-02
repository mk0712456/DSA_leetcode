package string;

import java.util.HashMap;

public class permutation_or_not2 {
    static boolean match(String s1, String s2){
        // s1 hashmap la podu
        // s2 ku sliding window potu count check pannu
        int ans = 0;
        HashMap<Character, Integer> hm1 = new HashMap<>();
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
        int k = s1.length();
        int count = 0;
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0;i<k;i++){
            char ch = s2.charAt(i);
            if(hm2.containsKey(ch)){
                int x = hm2.get(ch);
                hm2.put(ch, x+1);
            }
            else{
                hm2.put(ch, 1);
            }
            if(hm1.containsKey(ch) && hm2.get(ch)<= hm1.get(ch)){
                count++;
            }
        }
        if(count == s1.length()){
            return true;
        }

        int s = 1;
        int e = k;
        while(e<s2.length()){
            char start = s2.charAt(s-1);
            char end = s2.charAt(e);
            //start will be there in the hashmap
            int x  = hm2.get(start);
            hm2.put(start, x-1);
            //end will not be in hashmap
            if(hm2.containsKey(end)){
                int y = hm2.get(end);
                hm2.put(end, y+1);
            }
            else{
                hm2.put(end, 1);
            }
            if(hm1.containsKey(start) && hm2.get(start) <= hm1.get(start)){
                count--;
            }
            if(hm1.containsKey(end) && hm2.get(end)<= hm2.get(end)){
                count++;
            }
            s++;
            e++;
            if(count == s1.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println( match(s1, s2) );
    }
}
