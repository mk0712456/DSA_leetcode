package Dynamic_programming;

public class insertion_sort {
    public static void main(String[] args) {
        int a[] = {5,7,9,4,3,2,1};
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j>=0;j--){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
