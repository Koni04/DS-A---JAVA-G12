package DataStructure.DepthFS;

import DataStructure.AdjancencyMatrix.Node;

public class Main {
    public static void main(String [] args) {
        Graph graph = new Graph(5);

        graph.addNode(new DataStructure.DepthFS.Node('A'));
        graph.addNode(new DataStructure.DepthFS.Node('B'));
        graph.addNode(new DataStructure.DepthFS.Node('C'));
        graph.addNode(new DataStructure.DepthFS.Node('D'));
        graph.addNode(new DataStructure.DepthFS.Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        graph.depthFirstSearch(0);

    }
}
