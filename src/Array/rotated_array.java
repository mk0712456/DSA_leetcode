package Array;

public class rotated_array {
    static boolean check(int ar[], int n){
        //if sorted + rotated one drop point
        // in this ex 4,5,1,2,3  , 5,1 is the drop point
        // if sorted, bt not rotated, no drop point
        // drop point is there bcoz of rotation
        // consider a[n-1] > a[0] as drop point
        int count = 0;
        //for sorted + rotated
        for(int i=0;i<n-1;i++){
            if(ar[i] > ar[i+1]){
                count++;
            }
        }
        //for sorted ALONE
        if(ar[n-1] > ar[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        int n = ar.length;
        System.out.println( check(ar, n) );
    }
}
