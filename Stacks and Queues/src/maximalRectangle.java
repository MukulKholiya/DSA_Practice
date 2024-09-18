import java.util.*;
public class maximalRectangle {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int[] arr = new int[matrix[0].length];
        int ans = 0;
        for(int i = matrix.length-1 ; i>=0 ; i--){
            if(i==matrix.length-1){
                arr= matrix[i];

            }
            else{
                for (int j = 0; j < matrix[0].length; j++) {
                    arr[j] = matrix[i][j] == 1 ? arr[j] = arr[j]+1 : 0;
                }

            }
            ans = Math.max(ans,rectangle(arr));
        }

    }
    public static int rectangle(int[] arr){
        Stack<Integer> st = new Stack<>();
        int area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h = arr[st.pop()];
                if(!st.isEmpty()){
                    int l = st.peek();
                    area = Math.max(area,h*(i -l-1));
                }
                else{
                    area = Math.max(area,h*i);
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty()){
            int h = arr[st.pop()];
            if(!st.isEmpty()){
                int l = st.peek();
                area = Math.max(area,h*(r-l-1));
            }
            else{
                area = Math.max(area,h*r);
            }
        }
        return area;
    }
    
}
