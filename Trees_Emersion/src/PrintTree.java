public class PrintTree {
    public static void main(String[] args) {
        TreeImplementation tree = new TreeImplementation();
//      10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

//        tree.Display();
        System.out.println(tree.maxNode());
        System.out.println(tree.findNode(70));
        System.out.println(tree.height());
        tree.preOrderTraversal();
        tree.levelOrderTraversal();
    }
}
