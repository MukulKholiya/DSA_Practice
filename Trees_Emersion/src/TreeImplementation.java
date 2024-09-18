import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeImplementation {
    static class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public TreeImplementation(){
        root = CreateTree();
    }
    Scanner sc = new Scanner(System.in);
    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hasLeftChild = sc.nextBoolean();

        if(hasLeftChild){
            nn.left = CreateTree();
        }
        boolean hasRightChild = sc.nextBoolean();

        if(hasRightChild){
            nn.right = CreateTree();
        }
        return nn;

    }
    public void Display(){
        Display(root);
    }
    public void Display(Node node){
        if(node == null){
            return;
        }
        String s = "";
        s = "<---"+node.val+"--->";
        if(node.left!=null){
            s = node.left.val+s;
        }
        else{
            s = "."+s;
        }
        if(node.right!=null){
            s = s+node.right.val;
        }
        else{
            s = s+".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
    public int maxNode(){
        return maxNode(root);
    }
    public int maxNode(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int left = maxNode(node.left);
        int right = maxNode(node.right);
        return Math.max(left,Math.max(right,node.val));
    }
    public boolean findNode(int item){
        return findNode(root,item);
    }
    public boolean findNode(Node node,int item){
        if(node==null){
            return false;
        }
        if(node.val == item){
            return true;
        }

        boolean b1 = findNode(node.left,item);

        boolean b2 = findNode(node.right,item);

        return b1||b2;
    }
    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public void preOrderTraversal(){
        preOrderTraversal(root);
        System.out.println();
    }
    public void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public void inOrderTraversal(){
        inOrderTraversal(root);
        System.out.println();
    }
    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.val+" ");
        inOrderTraversal(node.right);
    }
    public void postOrderTraversal(){
        postOrderTraversal(root);
        System.out.println();
    }
    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val+" ");
    }
    public void levelOrderTraversal(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.poll();
            System.out.print(n.val+" ");
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
        }
        System.out.println();
    }

}
