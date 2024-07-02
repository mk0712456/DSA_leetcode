package Dynamic_programming;

public class fibonacci {
    public static int fib(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]==-1){
            dp[n] = fib(n-1,dp)+ fib(n-2,dp);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        System.out.println(fib(n, dp));
        for(int i=0;i<dp.length;i++){
            System.out.println(dp[i]+" ");
        }
    }
}
