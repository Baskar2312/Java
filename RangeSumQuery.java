public class RangeSumQuery {
    int[][] prefix;
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };
        RangeSumQuery obj = new RangeSumQuery();
        obj.NumMatrix(matrix);
        System.out.println(obj.sumRegion(2, 1, 4, 3)); // Output: 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // Output: 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // Output: 12
    }
    public void NumMatrix(int[][] matrix) {
        prefix=new int[matrix.length][matrix[0].length];
        prefix[0][0]=matrix[0][0];
        for(int i=1;i<matrix[0].length;i++){
            prefix[0][i]=matrix[0][i]+prefix[0][i-1];
        }
        for(int j=1;j<matrix.length;j++){
            prefix[j][0]=matrix[j][0]+prefix[j-1][0];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                prefix[i][j]=matrix[i][j]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=prefix[row2][col2];
        if(row1>0) sum-=prefix[row1-1][col2];
        if(col1>0) sum-=prefix[row2][col1-1];
        if(row1>0 && col1>0) sum+=prefix[row1-1][col1-1];
        return sum;
    }
}
