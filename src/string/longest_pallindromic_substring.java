package string;

public class longest_pallindromic_substring {
    static int longest(String s, int n){
        int odd = 0;
        int even = 0;
        for(int i=0;i<n;i++){
            int p1 = i;
            int p2 = i;
            while(p1>=0 && p2<n) {
                if (s.charAt(p1) == s.charAt(p2)) {
                    p1--;
                    p2++;
                }
                else{
                    break;
                }
            }
            int len = p2-p1-1;
            odd = Math.max(len, odd);
        }
        for(int i=0;i<n;i++){
            int p1 = i;
            int p2 = i+1;
            while(p1>=0 && p2<n) {
                if (s.charAt(p1) == s.charAt(p2)) {
                    p1--;
                    p2++;
                }
                else{
                    break;
                }
            }
            int len = p2-p1-1;
            even = Math.max(len, even);
        }
        int ans = Math.max(odd, even);
        return ans;
    }
    public static void main(String[] args) {
        String s = "abacab";
        int n = s.length();
        int ans = longest(s, n);
        System.out.println(ans);
    }
}
