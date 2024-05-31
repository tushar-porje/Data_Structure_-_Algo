package Trees.depthFirstTraversal;

/*  
        4
    3       5
2      1  6     7

*/

public class PreOrderTraversal {
    public static void main(String[] args) {
        Tree root=new Tree(4);
        root.left=new Tree(3);
        root.right=new Tree(5);
        root.left.left=new Tree(2);
        root.left.right=new Tree(1);
        root.right.left=new Tree(6);
        root.right.right=new Tree(7);
        
        solution(root);
        
    }

    public static void solution(Tree root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        solution(root.left);
        solution(root.right);

    }
}
