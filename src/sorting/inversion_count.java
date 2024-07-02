package sorting;

public class inversion_count {
    public static void main(String[] args) {
        int ar[] = {10, 3, 8, 15, 6};
        int n = ar.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        //TC is O(n^2)
    }
}
