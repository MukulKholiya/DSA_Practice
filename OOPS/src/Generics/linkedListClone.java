package Generics;

public class linkedListClone<T> {

         class Node{
            T val;
            Node Next;
        }
        private Node head;
        private Node tail;
        private int size;
        public void addFirst(T item){
            Node nn = new Node();
            nn.val = item;
            if(size == 0){
                head = nn;
                tail = nn;
                size++;
            }
            else{
                nn.Next = head;
                head = nn;
                size++;
            }
        }
        public void addLast(T item){
            if(size==0){
                addFirst(item);
            }
            else{
                Node nn = new Node();
                nn.val = item;
                tail.Next = nn;
                tail = nn;
                size++;
            }
        }
        public Node GetNode(int k)throws Exception{
            if(k<0 || k>=size){
                throw new Exception("Range ke Bahar");
            }
            Node temp = head;
            for (int i = 0; i < k; i++) {
                temp = temp.Next;
            }
            return temp;
        }
        public void addAtIndex(int k ,T item)throws Exception{
            if(k==0){
                addFirst(item);
            } else if (k==size) {
                addLast(item);
            }
            else{
                Node nn = new Node();
                nn.val = item;
                Node k_1th = GetNode(k-1);
                nn.Next = k_1th.Next;
                k_1th.Next = nn;
                size++;
            }
        }
        public T getFirst(){
            return head.val;
        }

        public T getLast() {
            return tail.val;
        }
        public T getAtIndex(int k) throws Exception{
            return GetNode(k).val;
        }
        public T removeFirst(){
            Node temp = head;
            if(size==1){
                head = null;
                tail = null;
                size--;
            }else {
                head = head.Next;
                temp.Next = null;
                size--;
            }
            return temp.val;
        }
        public T removeLast()throws Exception{
            if(size==1){
                return removeFirst();
            }
            else{
                Node prev = GetNode(size-2);
                T rv = tail.val;
                tail = prev;
                tail.Next = null;
                size--;
                return rv;
            }
        }
        public T removeAtIndex(int k)throws Exception{
            if(k==0){
                return removeFirst();

            } else if (k==size-1) {
                return removeLast();
            }
            else {
                Node prev = GetNode(k-1);
                Node post = GetNode(k);
                prev.Next = post.Next;
                post.Next = null;
                size--;
                return post.val;

            }

        }
        public void Display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+"--->");
                temp = temp.Next;
            }
            System.out.println(".");
        }



}
