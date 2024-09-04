package MonuHeap;

import java.util.ArrayList;

public class Heap {
    private final ArrayList<Integer> lst = new ArrayList<>();
    public void addElement(int item){
        lst.add(item);
        upHeapify(lst.size()-1);
    }
    public void swap(int pi , int ci){
        int val1 = lst.get(pi);
        int val2 = lst.get(ci);
        lst.set(pi,val2);
        lst.set(ci,val1);
    }
    private void upHeapify(int ci){
        int pi = (ci-1)/2;

        if(lst.get(pi)>lst.get(ci)){
            swap(pi,ci);
            upHeapify(pi);
        }

    }
    public int peek(){
        return lst.get(0);
    }
    private void downHeapify(int pi){
        int lci = 2*pi +1;
        int rci = 2*pi +2;

        int mini = pi;
        if(lci<lst.size() && lst.get(mini)>lst.get(lci)) {
            mini = lci;
        }
        if(rci<lst.size() && lst.get(mini)>lst.get(rci)) {
            mini = rci;
        }
        if(mini!=pi) {
            swap(mini, pi);
            downHeapify(mini);
        }


    }
    public int remove(){
        swap(0,lst.size()-1);
        int rv = lst.removeLast();
        return rv;
    }
    public int get(){
        return lst.get(0);
    }
    public void Display(){
        System.out.println(lst);
    }

    @Override
    public String toString() {
        return "Heap{" +
                "lst=" + lst +
                '}';
    }
}
