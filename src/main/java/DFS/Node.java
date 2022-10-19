package DFS;

import java.util.List;

class Node {
    public int val;
    private List<Node> children;

    public boolean[] visited;

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
        visited = new boolean[_children.size()];
    }

    public List<Node> getChildrens(){
        return children;
    }

    public Node getChildren(int index){
        return children.get(index);
    }
};
