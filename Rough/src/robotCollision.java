import java.util.*;
public class robotCollision {
    public static class robot{
        int health;
        char direction;
        public robot(int i , char c){
            this.health = i;
            this.direction = c;
        }

    }
    public static void main(String[] args) {
        List<robot> lst = new ArrayList<>();
        int[] pos = {3,5,2,6};
        int[] health = {10,10,15,12};
        String direction = "RLRL";

        for(int i=0 ; i<pos.length ; i++){
            robot r = new robot(health[i],direction.charAt(i));
            lst.add(r);
        }
        for(robot r:lst){
            System.out.println(r.health+" "+r.direction);
        }
        find(lst);
    }
    public static void find(List<robot> lst){
        Stack<robot> st = new Stack<>();
        for(robot r :lst){
            if(st.isEmpty()) st.push(r);
            else if(st.peek().direction==r.direction) st.push(r);
            else if(st.peek().direction=='L' && r.direction=='R') st.push(r);
            else {
                while (!st.isEmpty() && st.peek().direction != r.direction) {
                    robot k = st.pop();
                    if(k.health==r.health) continue;
                    else if (k.health > r.health) {
                        k.health = k.health - 1;
                        st.push(k);
                    } else if (r.health > k.health) {
                        r.health = r.health - 1;
                        st.push(r);
                    }
                }
            }
//            st.push(r);
        }
        List<Integer> ls = new ArrayList<>();
        while(!st.isEmpty()){
            ls.add(st.pop().health);
        }
        System.out.println(ls);

    }
}
