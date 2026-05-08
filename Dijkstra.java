import java.util.*;
class Pair{
    int node;
    int weight;
    public Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}
public class Dijkstra {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 4, 0, 0, 0},
            {1, 0, 4, 2, 7, 0},
            {4, 4, 0, 3, 5, 0},
            {0, 2, 3, 0, 4, 6},
            {0, 7, 5, 4, 0, 7},
            {0, 0, 0, 6, 7, 0}
        };
        int n=graph.length;
        int source = 0;
        List<List<Pair>> list=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // If weight is not 0 and not i (self-loop), it's an edge
                if(graph[i][j] != 0) {
                    list.get(i).add(new Pair(j, graph[i][j]));
                }
        }
    }
        int[] res=new Dijkstra().dijkstra(list, source);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public int[] dijkstra(List<List<Pair>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));
        pq.offer(new Pair(source, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int weight = current.weight;
            if (weight > dist[node]) continue;
            for (Pair neighbor : graph.get(node)) {
                int newDist = dist[node] + neighbor.weight;
                if (newDist < dist[neighbor.node]) {
                    dist[neighbor.node] = newDist;
                    pq.offer(new Pair(neighbor.node, newDist));
                }
            }
        }
        return dist;
    }
}
