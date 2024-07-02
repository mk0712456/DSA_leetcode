package sorting;

import org.w3c.dom.ls.LSOutput;

public class merge_sort {
    static int[] merge(int left[], int right[]){
        int p1=0, p2=0, p3=0;
        int n = left.length;
        int m = right.length;
        int ans[] = new int[n+m];
        while(p1<n && p2<m){
            if(left[p1] < right[p2]){
                ans[p3] = left[p1];
                p1++;
                p3++;
            }
            else{
                ans[p3] = right[p2];
                p2++;
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
            p3++;
            p2++;
        }
        return ans;
    }
    static int[] merge_sort(int a[], int s, int e){
        if(s==e){
            int aa[] = new int[1];
            aa[0] = a[s];
            return aa;
        }
        int m = (s+e)/2;
        int left[] = merge_sort(a, s, m);
        int right[] = merge_sort(a, m+1, e);
        int ans[] = merge(left, right);
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,4,5,6,7,9};
        int n = a.length;
        int ans[] = merge_sort(a, 0, n-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
