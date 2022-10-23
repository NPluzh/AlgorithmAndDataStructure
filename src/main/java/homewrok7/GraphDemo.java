package homewrok7;

public class GraphDemo {

    public static void main(String[] args) {
        Graph graph = new GraphImpl();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");


        graph.addEdge("A", "D", 5);
        graph.addEdge("A", "E", 10);
        graph.addEdge("A", "F", 7);

        graph.addEdge("B", "C", 6);
        graph.addEdge("B", "D", 4);

        graph.addEdge("C", "E", 2);
        graph.addEdge("C", "F", 1);

        graph.addEdge("D", "B", 7);

        System.out.println(graph);
        System.out.println();


    }


}
