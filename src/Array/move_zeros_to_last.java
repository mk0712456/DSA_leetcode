package Array;

public class move_zeros_to_last {
    static void move(int ar[], int n){
        int size = 0;
        for(int i=0;i<n;i++){
            if(ar[i]==0){
                size++;
            } else if (size>0) {
                int temp = ar[i];
                ar[i] = 0;
                ar[i-size] = temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ar[] = {0,1,0,3,1,2};
        int n = ar.length;
        move(ar, n);
    }
}
