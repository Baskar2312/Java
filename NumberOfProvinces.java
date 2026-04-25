public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        System.out.println(new NumberOfProvinces().findCircleNum(isConnected));  
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int provinces=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                dfs(isConnected,visited,i);
            }
        }
        return provinces;
    }
    public void dfs(int[][] isConnected,boolean[] visited,int city){
        visited[city]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[city][j]==1 && !visited[j]){
                dfs(isConnected,visited,j);
            }
        }
    }
}
