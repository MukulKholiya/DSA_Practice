import java.util.*;
public class pathToAGivenNode {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(-1);
        root.right.left = new TreeNode(-1);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        ArrayList<Integer> lst = new ArrayList<>();
        path(root,8,lst);
    }
    public static void path(TreeNode root , int x,ArrayList<Integer> lst){
       if(root == null){
           return;
       }
       if(root.left == null && root.right == null && root.val == x){
           lst.add(root.val);
           System.out.println(lst);
           return;
       }
       lst.add(root.val);
       path(root.left,x,lst);
       path(root.right,x,lst);
       lst.remove(lst.size()-1);


    }
}
