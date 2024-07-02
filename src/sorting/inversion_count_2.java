package sorting;

public class inversion_count_2 {
    static int[] merge_1(int left[], int right[]){
        int n = left.length;
        int m = right.length;
        int ans[] = new int[n+m];
        int p1=0, p2=0, p3=0;
        while(p1<n && p2<m){
            if(left[p1]>right[p2]){
                ans[p3] = right[p2];
                p2++;
                p3++;
                count = count + (n-p1);
            }
            else{
                ans[p3] = left[p1];
                p1++;
                p3++;

            }
        }
        while(p1<n){
            ans[p3] = left[p1];
            p3++;
            p1++;
        }
        while(p2<m){
            ans[p3] = right[p2];
            p2++;
            p1++;
        }
        return ans;
    }
    static int[] merge_sort_1(int ar[], int s, int e){
        if(s==e){
            int aa[] = new int[1];
            aa[0] = ar[e];
            return aa;
        }
        int m = (s+e) /2;
        int left[] = merge_sort_1(ar, s, m);
        int right[] = merge_sort_1(ar, m+1, e);
        int ans[] = merge_1(left, right);
        return ans;
    }
    static int count = 0;
    public static void main(String[] args) {
        int ar[] = {10,3,8,15,6,12,2,18,7,1};
        int n = ar.length;
        int ans [] = merge_sort_1(ar, 0, n-1);
        System.out.println(count);
    }
}
