import java.util.*;
public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int n = 9;
        int m = 7;
        int[] arr1 = {2,3,5,6,7,11,19,20,23};
        int[] arr2 = {1,3,5,6,8,9,10};
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
        for (int k = 0; k < newArr.length; k++) {
            System.out.print(newArr[k]+" ");
        }


    }
}
