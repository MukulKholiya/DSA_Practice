public class BinarySearchTree {
    class TreeNode{
        int val ;
        TreeNode left;
        TreeNode right;
    }
    private TreeNode root;
    public void Binary_Search_Tree(int[] inorder,int startIndex, int endIndex){
        root = CreateTree(inorder,0,inorder.length-1);
    }
    private TreeNode CreateTree(int[] inorder, int startIndex , int endIndex){
        if(startIndex>endIndex){
            return null;
        }
        int mid = (startIndex + endIndex)/2;
        TreeNode nn = new TreeNode();
        nn.left = CreateTree(inorder,startIndex,mid-1);
        nn.right = CreateTree(inorder,mid+1,endIndex);
        return nn;
    }
}
