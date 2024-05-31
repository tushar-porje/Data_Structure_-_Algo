package Trees.depthFirstTraversal;

public class Tree {
    int data;
    Tree left;
    Tree right;
    
    public Tree() {
        this.data=-1;
        this.left=null;
        this.right=null;
    }

    public Tree(int data) {
        this();
        this.data = data;
    }

    public Tree(int data, Tree left, Tree right) {
        this(data);
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Tree [data=" + data + ", left=" + left + ", right=" + right + "]";
    }
}
