public class stack_client {
    public static void main(String[] args)throws Exception {
        stack sc = new stack();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        sc.push(60);
        System.out.println(sc.peek());
        sc.Display();
    }
}
