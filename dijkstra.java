import java.util.*;

class Dijkstra {

    static class Edge {
        int target, weight;

        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex, distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;

            for (Edge edge : graph.get(u)) {
                int v = edge.target;
                int weight = edge.weight;

                if (distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    pq.add(new Node(v, distances[v]));
                }
            }
        }

        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t" + distances[i]);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of vertices
        List<List<Edge>> graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 3));
        graph.get(1).add(new Edge(2, 2));
        graph.get(1).add(new Edge(4, 4));
        graph.get(2).add(new Edge(3, 9));
        graph.get(3).add(new Edge(2, 7));
        graph.get(4).add(new Edge(1, 1));
        graph.get(4).add(new Edge(2, 8));
        graph.get(4).add(new Edge(3, 2));

        int source = 0;
        dijkstra(graph, source);
    }
}