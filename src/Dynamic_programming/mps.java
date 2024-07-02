package Dynamic_programming;

public class mps {
    public static int msp(int n, int dp[]){
       if(n==0){
           return 0;
       }
       if(dp[n]==-1){
           int i=1;
           int val=Integer.MAX_VALUE;
           while(i*i<=n){
               val = Math.min(val, msp((n-i*i),dp));
               i++;
           }
           dp[n]=val+1;
       }
       return dp[n];
    }
    public static void main(String[] args) {
        int n =5;
        int dp[] = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        System.out.println(msp(n,dp));
        for(int i=1;i<=5;i++){
            System.out.print(dp[i]+" ");
        }
    }
}
