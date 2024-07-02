package string;

public class reverse_string {
    public static String stringReverse(char ar[], int s, int e ){
        while(s<=e){
            char temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;
            s++;
            e--;
        }
        String ans = new String(ar);
        return ans;
    }
    public static void main(String[] args) {
        String str = "Manikandan";
        char ar[] = str.toCharArray();
        String ans = stringReverse(ar, 0, str.length()-1);
        System.out.println(ans);
    }
}
