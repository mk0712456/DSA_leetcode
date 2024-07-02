package Dynamic_programming;

public class max_sub_sum {
    /*public static int mss(int a[], int n, int dp[]){
        if(n<0){
            return 0;
        }
        if(dp[n]==-1){
            dp[n] = Math.max(mss(a,n-1, dp),mss(a,n-2,dp)+a[n]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int a[] ={2,-1,4,5,3,-1,4,2};
        int n = a.length;
        int dp[] = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = -1;
        }
        System.out.println(mss(a,n-1,dp));
    }*/
    public static void main(String[] args) {
        int a[] ={2,-1,4,5,3,-1,4,2};
        int n = a.length;
        int dp[] = new int[n];
        dp[0] = Math.max(0,a[0]);
        dp[1] = Math.max(dp[0],a[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+a[i], dp[i-1]);
        }
        System.out.println(dp[n-1]);
    }
}
