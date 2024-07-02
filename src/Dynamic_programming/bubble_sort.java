package Dynamic_programming;

public class bubble_sort {
    public static void main(String[] args) {
        int a[] = {10,8,7,9,5,4,6,3};
        int n = a.length-1;
        for(int i=0;i<n;i++){
            int swaps = 0;
            //j<n-1 coz a[j+1] is there in if condition
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}
