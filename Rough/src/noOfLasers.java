import java.util.*;
public class noOfLasers {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        List<Integer> lst = new ArrayList<>();
        for(int i=0 ; i<bank.length ; i++){
            if(count(bank[i])!=0){
                lst.add(count(bank[i]));
            }
        }
//        System.out.println(lst);
        int sum = 0;
        for(int i=0 ; i<lst.size()-1 ;  i++){
            sum += lst.get(i)*lst.get(i+1);
        }
        System.out.println(sum);
    }
    public static int count(String s){
        int cnt =0;
        for(char c : s.toCharArray()){
            if(c=='1') cnt++;
        }
        return cnt;
    }
}
