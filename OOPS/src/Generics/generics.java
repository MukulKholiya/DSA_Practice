package Generics;

public class generics {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};
        Display(arr);

        String[] arr1 = {"Mukul","Kholiya","Ankur","Hariom","KC"};
    }
//    public static void Display(Integer[] arr){
//        for(int i=0 ; i<arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//    }
    public static <T> void Display(T[] arr){
        for(T ar:arr){
            System.out.print(ar+" ");
        }
        System.out.println();
    }
}
