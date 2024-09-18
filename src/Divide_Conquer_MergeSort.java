public class Divide_Conquer_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,1,3};
        int [] ans = Sort(arr,0,arr.length-1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
    public static int [] Sort(int[] arr , int si , int ei){
        if(si==ei){
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si+ei)/2;
        int[] first = Sort(arr,si,mid);
        int[] sec = Sort(arr , mid+1 , ei);
        return Merge(first,sec);
    }
    public static int[] Merge(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
//        int[] arr1 = {2,3,5,6,7,11,19,20,23};
//        int[] arr2 = {1,3,5,6,8,9,10};
        int[] newArr = new int[n+m];
        int i=0;
        int j=0;
        int ind=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                newArr[ind] = arr1[i];
                ind++;
                i++;
            } else if (arr1[i]>arr2[j]) {
                newArr[ind] = arr2[j];
                j++;
                ind++;
            }
        }
        if(n>i){
            while(i<n){
                newArr[ind] = arr1[i];
                i++;
                ind++;
            }
        } else if (m>j) {
            while(j<m){
                newArr[ind] = arr2[j];
                j++;
                ind++;
            }
        }
        return newArr;
    }
}
