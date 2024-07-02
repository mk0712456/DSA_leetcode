package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        //program to interface not implementation
        HashMap<Integer, Integer> hm = new HashMap<>();
        Set<String> hs = new LinkedHashSet<>();
        hs.add("CSK");
        hs.add("RCB");
        hs.add("KKR");
        hs.add("RR");
        hs.add("SRH");
        for(String team : hs){
            System.out.println(team);
        }
    }
}
