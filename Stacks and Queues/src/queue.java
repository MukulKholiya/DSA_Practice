public class queue {
    private int[] arr;
    private int front;
    private int size;
    public queue(){
        arr = new int[5];
    }
    public queue(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public void enqueue(int n)throws Exception{
        if(isFull()){
            throw new Exception("Queue full h");
        }
        int idx = (front+size)%arr.length;
        arr[idx] = n;
        size++;
    }
    public int dequeue(){
        int v = arr[front];
        front=(front+1)%arr.length;
        size--;
        return v;
    }

    public boolean isFull(){
        return size==arr.length;
    }
    public int getFront()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue empty h");
        }
        int v = arr[front];
        return v;
    }
    public void Display(){
        for (int i = 0; i < size; i++) {
            int idx = (front+i)%arr.length;
            System.out.println(arr[idx]);
        }
    }
}
