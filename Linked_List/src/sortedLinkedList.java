import java.util.*;
public class sortedLinkedList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode headB=mid.next;
        mid.next=null;
        ListNode A=sortList(head);
        ListNode B=sortList(headB);
        return mergeTwoLists(A,B);

    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                Dummy.next = a;
                Dummy = Dummy.next;
                a = a.next;
            } else {
                Dummy.next = b;
                Dummy = Dummy.next;
                b = b.next;
            }
        }
        if (a != null) {
            Dummy.next = a;
        }
        if (b != null) {
            Dummy.next = b;
        }
        return temp.next;

    }
    public class linkedList {
        static class Node {
            int val;
            Node Next;
        }

        private Node head;
        private Node tail;
        private int size;

        public void addFirst(int item) {
            Node nn = new Node();
            nn.val = item;
            if (size == 0) {
                head = nn;
                tail = nn;
                size++;
            } else {
                nn.Next = head;
                head = nn;
                size++;
            }
        }

        public void addLast(int item) {
            if (size == 0) {
                addFirst(item);
            } else {
                Node nn = new Node();
                nn.val = item;
                tail.Next = nn;
                tail = nn;
                size++;
            }
        }
    }
    public void main(String[] args) {
        linkedList cl = new linkedList();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addLast(80);
        node head = cl.head;

    }
}