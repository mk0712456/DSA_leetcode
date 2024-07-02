package string;

public class pallindrome {
    static boolean check(String str, int s, int e){
        while (s<=e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="amamadamaaa";
        int s = 3;
        int e = 8;
        boolean ans = check(str, s, e);
        System.out.println(ans);
    }
}
