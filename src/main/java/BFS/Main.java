package BFS;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public class Main {
    public static Optional<Node> search(Integer value, Node start) {
        Queue<BFS.Node> queue = new ArrayDeque<>();
        queue.add(start);

        Node currentNode;

        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                queue.addAll(currentNode.getNeighbors());
            }
        }

        return Optional.empty();
    }
}
