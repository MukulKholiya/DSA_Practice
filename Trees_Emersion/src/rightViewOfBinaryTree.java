import java.util.ArrayList;
import java.util.List;

import com.sun.source.tree.Tree;

public class rightViewOfBinaryTree {
    int maxDepth = 0;
    public static void main(String[] args) {
        TreeImplementation root = new TreeImplementation();
        root.
        List<Integer> lst = new ArrayList<>();
        int currentLevel = 0;
        rightView(root,currentLevel,lst);
        System.out.println(lst);
    }
    public void rightView(Node root, int currentLevel, List<Integer> lst){
        if(root==null){
            return;
        }
        if(maxDepth<currentLevel){
            lst.add(root.val);
            maxDepth = currentLevel;
        }
        rightView(root.right,currentLevel+1,lst);
        rightView(root.left,currentLevel+1,lst);
    }
}
