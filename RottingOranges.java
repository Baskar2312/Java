import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(new RottingOranges().orangesRotting(grid));  
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        int minutes=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            int size=q.size();
            boolean rotedOrange=false;
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                for(int d=0;d<4;d++){
                    int nr=r+dr[d];
                    int nc=c+dc[d];
                    if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        rotedOrange=true;
                        fresh--;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            if(rotedOrange) minutes++;
        }
        return fresh==0?minutes:-1;
    }
}
