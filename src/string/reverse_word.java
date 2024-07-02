package string;

public class reverse_word {
    static String reverse_sentence(String s){
        String ar[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=ar.length-1;i>=0;i--){
            if(!ar[i].isEmpty()){
                sb.append(ar[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = " Hello World ";
        String ans = reverse_sentence(str);
        System.out.println(ans);
    }
}
