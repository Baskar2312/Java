public class MinimumSpanningtree {
    public static void main(String[] args){
        int v= 4;
        int e= 5;
        int[][] edges = {{0,1,10},{0,2,6},{0,3,5},{1,3,15},{2,3,4}};
        int[][] mst = primMST(v, e, edges);
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (int i = 0; i < v - 1; i++) {
            System.out.println(mst[i][0] + " - " + mst[i][1] + ": " + mst[i][2]);
        }
        
    }
    public static int[][] primMST(int v, int e, int[][] edges) {
        int[][] mst = new int[v - 1][3];
        boolean[] visited = new boolean[v];
        visited[0] = true; // Start from the first vertex
        for (int i = 0; i < v - 1; i++) {
            int minEdge = Integer.MAX_VALUE;
            int u = -1, w = -1;
            for (int j = 0; j < e; j++) {
                if (visited[edges[j][0]] && !visited[edges[j][1]] && edges[j][2] < minEdge) {
                    minEdge = edges[j][2];
                    u = edges[j][0];
                    w = edges[j][1];
                }
                else if (!visited[edges[j][0]] && visited[edges[j][1]] && edges[j][2] < minEdge) {
                    minEdge = edges[j][2];
                    u = edges[j][1];
                    w = edges[j][0];
                }
            }
            mst[i][0] = u;
            mst[i][1] = w;
            mst[i][2] = minEdge;
            visited[w] = true;
        }
        return mst;
    }
}
