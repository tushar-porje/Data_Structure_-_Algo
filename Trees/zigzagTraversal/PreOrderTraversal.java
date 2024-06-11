package Trees.zigzagTraversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

import Trees.Tree;

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

    private static void solution(Tree root) {
        Deque<Tree> q = new LinkedList<Tree>();
        Vector<Integer> v = new Vector<Integer>();
        q.add(root);
        v.add(root.data);
        Tree temp;
        
        // set initial level as 1, because root is
        // already been taken care of.
        int l = 1;
                     
        while (q.size() > 0) {
            int n = q.size();
      
            for (int i = 0; i < n; i++) {
      
                if (l % 2 == 0) {
                    temp = q.peekLast();
                    q.pollLast();
                    System.out.print(temp.data+" ");
                }
                else {
                    temp = q.peekFirst();
                    q.pollFirst();
                    System.out.print(temp.data+" ");
                }
      
                if (l % 2 != 0) {
      
                    if (temp.right != null) {
                        q.add(temp.right);
                        v.add(temp.right.data);
                    }
                    if (temp.left != null) {
                        q.add(temp.left);
                        v.add(temp.left.data);
                    }
                }
                else if (l % 2 == 0) {
      
                    if (temp.left != null) {
                        q.offerFirst(temp.left);
                        v.add(temp.left.data);
                    }
                    if (temp.right != null) {
                        q.offerFirst(temp.right);
                        v.add(temp.right.data);
                    }
                }
            }
            l++;
        }
    }
    
}