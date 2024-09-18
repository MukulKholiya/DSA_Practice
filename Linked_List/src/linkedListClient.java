public class linkedListClient {
    public static void main(String[] args)throws Exception {
        linkedList ll = new linkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.Display();
        ll.addLast(60);
        ll.Display();
        ll.addAtIndex(2,90);
        ll.Display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(2));
        System.out.println(ll.removeAtIndex(2));
        ll.Display();
    }

}
