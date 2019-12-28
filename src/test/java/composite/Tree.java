package composite;

import static org.junit.Assert.*;

public class Tree {
    TreeNode root = null;
    public Tree(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args){
        Tree tree = new Tree("A");
        TreeNode nodeb = new TreeNode("B");
        TreeNode nodec = new TreeNode("c");
        tree.root.setParent(nodeb);
        nodeb.setParent(nodec);
        System.out.println(tree.root);
    }
}