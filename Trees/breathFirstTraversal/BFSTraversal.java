package Trees.breathFirstTraversal;

import java.util.LinkedList;
import java.util.Queue;

import Trees.Tree;

/*  
        4
    3       5
2      1  6     7

*/

// output = 2 3 1 4 6 5 7

public class BFSTraversal {
    
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

    private static void solution(Tree root) {
        if(root==null){
            return;
        }
        Queue<Tree> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Tree node=q.poll();
            System.out.println(node.data);
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
        }
    }
}
