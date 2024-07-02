package Implementation_on_DataStructures;

public class hashmap_implementation {
    public static void main(String[] args) {
        hashmap hm = new hashmap();
        hm.put("m" , "manikandan");
        hm.put("A", "amirta" );
        hm.put("m", "mani" );
        System.out.println(hm.get("m"));
        System.out.println(hm.get("A"));
        System.out.println(hm.get("m"));
        hm.remove("m");
        System.out.println(hm.get("m"));
        System.out.println(hm.contains("c"));
        System.out.println(hm.contains("A"));
    }
}
