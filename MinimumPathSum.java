public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(new MinimumPathSum().minPathSum(grid));
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] mat=new int[n][m];
        mat[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            mat[i][0]=grid[i][0]+mat[i-1][0];
        }
        for(int j=1;j<m;j++){
            mat[0][j]=grid[0][j]+mat[0][j-1];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                mat[i][j]=grid[i][j]+Math.min(mat[i-1][j],mat[i][j-1]);
            }
        }
        return mat[n-1][m-1];
    }
}
