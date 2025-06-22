package Learnings;

public class DoublyLinkedList {
    Node head;
    private class Node{
        public Node(int val) {
            this.val = val;
        }

        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void firstInsert(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
    }
    //print it
    public void display(){
        Node node = head;
        while(node!= null){
            System.out.println(node.val +"-->");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.firstInsert(1);
        dl.firstInsert(2);
        dl.firstInsert(3);
        dl.display();
    }

}
