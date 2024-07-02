package Dynamic_programming;

public class no_of_ways_2dmatrix {
    public static int unique_ways( int i, int j,int dp[][]){
        if(i==0 || j==0){
            dp[i][j] = 1;
        }
        if(dp[i][j]==-1){
            dp[i][j] = unique_ways(i-1,j,dp) + unique_ways(i,j-1,dp);
        }
        return dp[i][j];
    }
    public static void main(String[] args) {
        //recursive code
        int a[][] = new int[3][3];
        int dp[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                dp[i][j] = -1;
            }
        }
        int i=3,j=3;
        System.out.println(unique_ways(i-1,j-1,dp));

        //non-recursive code
       /*int dp[][] = new int[3][3];
        for(int i=0;i<3;i++){
            dp[i][0] = 1;
        }
        for(int j=0;j<3;j++){
            dp[0][j] = 1;
        }
        for(int i=1;i<3;i++){
            for(int j=1;j<3;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[2][2]);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
