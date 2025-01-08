public class TwoNonOverlappingIntervalsWithMaximumProfit {
    public static void main(String[] args){
        int[][] arr1 = {{1,3,2},{4,5,2},{2,4,3}};
        int[][] arr2 = {{1,3,2},{4,5,2},{1,5,5}};

    }
    public static boolean isOverlapping(int[] arr1,int[] arr2){
        if(arr1[1]>=arr2[0]) return true;
        return false;
    }
    public static int findMaxProfit(int[][] arr,int profit,int i,int[] prev){
        if(i==arr.length) return 0;
//        int add = findMaxProfit(arr,profit+arr[i][2],i+1,new int {} arr[i][]);
        if(!isOverlapping(prev,arr[i])){
            int add = 
        }
    }
}
