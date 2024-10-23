import com.sun.source.tree.Tree;

import java.util.Stack;

public class InfixToPostfix {
    static class TreeNode{
        char value;
        TreeNode left;
        TreeNode right;

        // Constructor
        public TreeNode(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

    }
    public String infixToPostfix(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                sb.append(ch);

            } else if (ch=='(') {
                st.push(ch);
            } else if (ch==')') {
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();// '(' removed
            }
            else{
                while(!st.isEmpty() && getPriority(st.peek())>=getPriority(ch)){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    private int getPriority(char ch){
        if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        else return -1;
    }
    public TreeNode postfixTree(String s){
        s = infixToPostfix(s);
        Stack<TreeNode> st = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            
            if(ch>='0' && ch<='9'){
                st.push(new TreeNode(ch));
            }
            else{
                TreeNode right = st.pop();
                TreeNode left = st.pop();
                TreeNode nn = new TreeNode(ch);
                nn.left = left;
                nn.right = right;
                st.push(nn);
            }
        }
        return st.peek();
    }
}
