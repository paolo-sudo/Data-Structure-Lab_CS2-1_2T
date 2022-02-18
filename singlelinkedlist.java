/*
Paolo
CS 2-1
Outcomes Evaluation 3 | February 18, 2022

*/

public class singlelinkedlist {
    
    class Node{
        int data;
        Node next;

        //constructor-defined method
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //represent the head and the tail
    public Node head = null;
    public Node tail = null;

    //method to add node in the linked list
    public void addNode(int data){
        //ability to create node using instance of the Node
        Node newNode = new Node(data);

        //Checker - if the list is empty
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            //new node will the tail
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Create a remove node method/function
    public void removeNode(int data){
        // Store head node
        Node temp = head, prev = null;

        //If head node itself holds the key to be deleted
        if(temp != null && temp.data == data){
            head = temp.next; // changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while(temp != null && temp.data != data){
            prev = temp;
            temp = temp.next; 
        }

        //if data is not present in linked list
        if(temp == null)
        return;

        //unlink the node from linked list
        prev.next = temp.next;
    }


    //method to display the linked list nodes
    public void printNode(){
        Node current = head;

        if(head == null){
            System.out.print("Linked list is empty");
            return;
        }
        System.out.print("Nodes of the linked list: ");
        while(current != null){
            System.out.print("  " + current.data);
            current = current.next;
        }
        System.out.println();
    }

    public void printNode2(){
        Node current = head;

        if(head == null){
            System.out.print("Linked list is empty");
            return;
        }
        
        while(current != null){
            
            System.out.print("  " +current.data);    
            current = current.next;
           
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        singlelinkedlist myList = new singlelinkedlist();
        System.out.println();
        System.out.println();

        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(3);
        myList.addNode(4);
        myList.addNode(5);
        
        myList.printNode();
        
        myList.removeNode(1); //delete node with data 1
        myList.removeNode(3); //delete node with data 3
        myList.removeNode(5); //delete node with data 5

        System.out.print("\nLinked list after deletion of 1, 3, and 5: ");
        myList.printNode2();
        System.out.println();
        System.out.println();
    }
}