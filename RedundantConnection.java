import java.util.ArrayList;
import java.util.List;

public class RedundantConnection {
    public static void main(String[] args) {
        int[][] edges={{1,2},{1,3},{2,3}};
        System.out.println(new RedundantConnection().findRedundantConnection(edges));
    }
    public static int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }
        int[] res=new int[2];
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            boolean[] visited=new boolean[n+1];
            if(dfs(adj,u,v,visited)){
                return edge;
            }
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return new int[0];
    }
    public static boolean dfs(List<List<Integer>> adj,int src,int des,boolean[] visited){
        if(src==des){
            return true;
        }
        visited[src]=true;
        for(int neighbour:adj.get(src)){
            if(!visited[neighbour]){
                if(dfs(adj,neighbour,des,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
