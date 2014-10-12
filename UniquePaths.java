public class UniquePaths{
  public int uniquePaths(int m, int n) {
        //动态规划
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            res[i][0]=1;
        }
        for(int j=0;j<n;j++){
            res[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
        /**second solution 
        int[] res=new int[n];
        for(int i=0;i<n;i++)
            res[i]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                res[j]=res[j]+res[j-1];
            }
        }
        return res[n-1];
        */
  }
}
