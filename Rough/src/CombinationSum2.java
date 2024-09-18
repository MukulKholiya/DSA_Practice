import java.util.*;
public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        ArrayList<Integer> lst = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        print(arr,0,0,target,lst,ll);
        System.out.println(ll);

    }
    public static void print(int[] arr , int index,int sum , int target,ArrayList<Integer> lst,List<List<Integer>> ll){
        if(sum==target){
//            System.out.println(lst);
            ll.add(new ArrayList<>(lst));
        }
        if(sum<0){
            return;
        }
        for(int i=index ; i<arr.length ; i++){
           if(i>index && arr[i] == arr[i-1]) continue;
           lst.add(arr[i]);
           print(arr,i+1,sum+arr[i],target,lst,ll);
           lst.remove(lst.size()-1);

        }
    }
}
