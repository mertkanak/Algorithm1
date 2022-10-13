/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa1;

/**
 *
 * @author Alperen
 */
class Node {
    int data;
    Node next;
}


class LinkedList {

    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) { //travelling to the end of the link
                n = n.next; // jumping between the nodes 
            }
            n.next = node ;
        }
    }


    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }


    public int showAt(int index){
        Node temp = head;
        int count = 0 ;
        if(index == 0){
            Node n = head;
            return n.data;
        }
        while(temp != null){
            count++;
            temp = temp.next;
            if(count == index) {
                return temp.data;
            } 
        }
        return 0;
    }
    

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0) {
            insertAtStart(data);
        } else {

            Node n = head;
            for (int i = 0; i < index-1 ; i++) {
            n = n.next;
                }
            node.next = n.next;
            n.next = node;
         }
    }


    public void show() {
        Node node = head;

        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}