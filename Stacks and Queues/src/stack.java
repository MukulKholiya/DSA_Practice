public class stack {
    private int[] arr;
    private int idx;
    public stack(){
        arr = new int[5];
    }
    public stack(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return idx==0;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Bhar gya bhai");
        }
        arr[idx] = item;
        idx++;
    }
    public boolean isFull(){
        return arr.length == idx;
    }
    public int size(){
        return idx;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Khali h bhai stack");
        }
        idx--;
        return arr[idx];
    }
    public int peek(){
        return arr[idx-1];
    }
    public void Display(){
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

}
