package Interface;

public class Stack {
    public static void main(String[] args) {
        Inter abc = new StackImpl();

//      Anonumous way to make object of Interfaces.
        Inter in = new Inter(){

            @Override
            public void push() {

            }

            @Override
            public int pop() {
                return 0;
            }

            @Override
            public int peek() {
                return 0;
            }
        };
//        IN java 8 you can define body of interfaces , by just defining it as "public static ".


    }
}
