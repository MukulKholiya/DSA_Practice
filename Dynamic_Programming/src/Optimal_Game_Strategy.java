public class Optimal_Game_Strategy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        System.out.println("abcd");
        System.out.println(f(arr,0,arr.length-1));
    }
    public static int f(int[] arr,int i,int j){
        if(i>j){
            return 0;
        }
        if(i+1==j){
            return Math.max(arr[i],arr[j]);
        }
        int a = arr[i] + Math.min(f(arr,i+2,j),f(arr,i+1,j-1));
        int b = arr[j] + Math.min(f(arr,i+1,j-1),f(arr,i,j-2));
        return Math.max(a,b);
    }

}
