package com.mycompany.linkedlist;
class Node {
    int data;
    Node next;
    Node prev;
}

class LL {
    Node head;
    Node tail;

    LL() {
        head = null;

    }
    
    
        //DOUBLY IMPLEMENTED
    void DelEnd(){
        Node second = head;
        Node first = head;
        second= second.next;
        
        while(second.next!=null){
            first=second;
            second.prev = null;
            second=second.next;
            tail = second;
        }
        
        first.next=null;
    }
 //DOUBLY IMPLEMENTED
    void DelSP(int a){
        
        Node curr = head;
        Node prev = head;
        curr = curr.next;
        while(curr!=null){
            if (curr.data == a){
                Node t = curr.next;
                t.prev = prev;
                prev.next = t;
            }
            prev = prev.next;
            curr = curr.next;
        }
        
          
    }
    
    //DOUBLY IMPLEMENTED
        void insert(int d) {
        Node n = new Node();
        n.data = d;
        n.next = null;
        n.prev = null;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        System.out.println(d + " has been inserted into the list");
    }
    
    //DOUBLY IMPLEMENTED
    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ->");
            t = t.next;
        }
    }


    //DOUBLY IMPLEMENTED
    void insertatend(int d) {
        Node n = new Node();
        n.data = d;
        n.next = null;
        n.prev = null;
        Node t = tail;
        if (tail == null) {
            tail = n;
            head = n;
        } else {
            while (t.next != null) {
                n.prev = t;
                tail = n;
                
            }
            t.next = n;

        }

    }
    

    
   
}
public class doublyLinkedList {


    public static void main(String[] args) {
        // TODO code application logic here
        //creating a new linked list object, "list"
        LL list = new LL();
        
        //insertion for playing with the data
        list.insert(7);
        list.insert(8);
        list.insert(3);
        list.insert(5);
        list.display();
        
        //deleting link that has the value "3" stored in it
        list.DelSP(3);
        System.out.println();
        list.display();
        
        //deleting the last object in the list
        list.DelEnd();
        System.out.println();
        list.display();
        
    }
}
