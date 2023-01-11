package com.mycompany.singlylinkedlist;

class Node {
    int data;
    Node next;
}
class LL {
    Node head;


    LL() {
        head = null;

    }
   
//    //SINGLY IMPLEMENTED
//
//    
    void DelEnd(){
        Node curr = head;
        Node prev = head;
        
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        
        prev.next=null;
    }
    //SINGLY IMPLEMENTED

    void DelSP(int a){
        
        Node prev = head;
        Node curr = head;
        curr=curr.next;
        while (curr != null) {
            if (curr.data==a){
                prev.next = curr.next;
            }
            prev = prev.next;
            curr = curr.next;
        }
        
          
    }
   
//SINGLY IMPLEMENTED
    void insert(int d) {
        Node n = new Node();
        n.data = d;
        n.next = null;
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
        System.out.println(d + " has been inserted into the list");
    }
    
    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ->");
            t = t.next;
        }
    }
  
    void insertatend(int d) {
        Node n = new Node();
        n.data = d;
        n.next = null;
        Node t = head;
        if (head == null) {
            head = n;
        } else {
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;

        }

    }
}




public class SinglyLinkedList {

    
    public static void main(String[] args) {
        
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
        
        //inserting an object in the last position
        list.insertatend(9);
        System.out.println();
        list.display();
        
    }
}

