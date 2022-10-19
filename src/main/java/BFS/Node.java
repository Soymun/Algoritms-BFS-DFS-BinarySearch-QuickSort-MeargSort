package BFS;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private Integer value;
    private Set<Node> neighbors;

    public Node(Integer value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public void connect(Node node) {
        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
        this.neighbors.add(node);
        node.neighbors.add(this);
    }

    public Integer getValue(){
        return value;
    }

    public Set<Node> getNeighbors(){
        return neighbors;
    }
}
