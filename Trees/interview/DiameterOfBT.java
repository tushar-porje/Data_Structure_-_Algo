package Trees.interview;

import Trees.Tree;

public class DiameterOfBT {
    static int diameter;
    public static int diameterOfBinaryTree(Tree root) {
       diameter=0;
       calculateDiameter(root);
       return diameter;
    }

    static int calculateDiameter(Tree root){
        if(root==null){
            return 0;
        }else{
            int leftHeight=calculateDiameter(root.left);
            int rightHeight=calculateDiameter(root.right);

            diameter=Math.max(diameter,leftHeight+rightHeight);

            return Math.max(leftHeight,rightHeight)+1;
        }
    }

    public static void main(String[] args) {
        Tree root=new Tree(4);
        root.left=new Tree(3);
        root.right=new Tree(5);
        root.left.left=new Tree(2);
        root.left.right=new Tree(1);
        root.right.left=new Tree(6);
        root.right.right=new Tree(7);

    
        
        System.out.println(diameterOfBinaryTree(root));
        
    }
}
