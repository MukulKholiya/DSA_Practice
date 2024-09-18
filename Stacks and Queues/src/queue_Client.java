public class queue_Client {
    public static void main(String[] args) throws Exception {
        queue q  = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
//        q.enqueue(60);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(60);
        q.Display();
    }
}
