package Strings;

public class Largest_Odd_Number_in_String {
    static String find(String nums){
        int index = 0;
        boolean flag = false;
        for(int i=nums.length()-1;i>=0;i--){
            int n = nums.charAt(i) - '0';
            if( (n&1) == 1){
                index = i;
                flag = true;
                break;
            }
        }
        if(flag == false){
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=index;i++){
            sb.append(nums.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "4206";
        System.out.println(find(str));
    }
}
