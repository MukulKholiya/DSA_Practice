package MonuHeap;


public class HeapClient {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.addElement(10);
        hp.addElement(20);
        hp.addElement(5);
        hp.addElement(40);
        hp.addElement(80);
        hp.addElement(60);
        hp.addElement(70);
        System.out.println(hp);
        System.out.println(hp.peek());
    }
}

