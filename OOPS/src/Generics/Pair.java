package Generics;

public class Pair<A,B> {
    A x;
    B y;
    public Pair(A x, B y){
        this.x = x;
        this.y = y;
    }
    public Pair(){
        super();
    }

    public static void main(String[] args) {
        Pair<Integer,Boolean> list = new Pair<>();
        Pair<Character,String> list2 = new Pair<>();
    }
}
