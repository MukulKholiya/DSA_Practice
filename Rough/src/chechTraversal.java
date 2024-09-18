import java.util.*;

public class chechTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] tree = new int[n][];
        for(int i=0 ; i<n-1 ;i++){
            tree[i][0] = scanner.nextInt();
            tree[i][1] = scanner.nextInt();
        }



        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean bool = check(tree,arr);
        System.out.println(bool?"Yes":"No");

    }
    public static boolean check(int[][] tree, int[] arr){
        if(arr[0]!=tree[0][0]) return false;
        for(int i=1; i<tree.length ; i++){
            if(tree[i][1]!=arr[i]) return false;
        }
        return true;
    }

//    public static int findRoot(List<List<Integer>> tree, int n) {
//        for (int i = 1; i <= n; i++) {
//            if (tree.get(i).size() == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static int[] bfsTraversal(List<List<Integer>> tree, int root, int n) {
//        int[] bfsSequence = new int[n];
//        boolean[] visited = new boolean[n + 1];
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(root);
//        visited[root] = true;
//        int index = 0;
//
//        while (!queue.isEmpty()) {
//            int node = queue.poll();
//            bfsSequence[index++] = node;
//
//            for (int neighbor : tree.get(node)) {
//                if (!visited[neighbor]) {
//                    visited[neighbor] = true;
//                    queue.add(neighbor);
//                }
//            }
//        }
//
//        return bfsSequence;
//    }
}
