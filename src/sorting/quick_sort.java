package sorting;

public class quick_sort {
    static void quick(int ar[], int s, int e){
        if(s>=e){
            return ;
        }
        int x = ar[ar.length-1];
        int j = 0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[j]<x){
                int temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
                j++;
            }
        }
        int p = j;
        quick(ar, s, p-1);
        quick(ar, p+1, e);
    }
    public static void main(String[] args) {
        int ar[] = {3,6,14,11,8,20,27,31,23,18};
        int n = ar.length-1;
        quick(ar, 0, n);
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
