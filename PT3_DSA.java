/*
Paolo D.
CS 2-1 | PT3 "Binary Trees Implementation - Insertion, Search, and Delete"
*/

import java.util.Scanner;

//class to create nodes
class Node {
    int key;
    Node leftST, rightST;

    public Node(int data){
        key = data;
        leftST = rightST = null;
    }
}

public class PT3_DSA {
    Node root; 

    PT3_DSA(){ 
        root = null; 
    } 
    //delete a node from Tree
    void deleteNode(int key) { 
        root = RecurDel(root, key); 
    } 

    //function recursive delete
    Node RecurDel(Node root, int key)  { 
        if (root == null)  return root; 

        if (key < root.key)     //traverse left subtree 
            root.leftST = RecurDel(root.leftST, key); 
        else if (key > root.key)  //traverse right subtree
            root.rightST = RecurDel(root.rightST, key); 
        else  { 
            if (root.leftST == null) 
                return root.rightST; 
            else if (root.rightST == null) 
                return root.leftST; 

            root.key = Value(root.rightST); 
            root.rightST = RecurDel(root.rightST, root.key); 
        } 
        return root; 
    } 

    int Value(Node root)  { 
        int minval = root.key; 
        while (root.leftST != null)  { 
            minval = root.leftST.key; 
            root = root.leftST; 
        } 
        return minval; 
    } 

    // insert a node
    void insert(int key)  { 
        root = inRecur(root, key); 
    } 

    //recursive insert function
    Node inRecur(Node root, int key) { 
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.leftST = inRecur(root.leftST, key); 
        else if (key > root.key)    //insert in the right subtree
            root.rightST = inRecur(root.rightST, key); 
        return root; 
    } 

    void inorder() { 
        InorderRecur(root); 
    } 

    // recursively traverse the BST  
    void InorderRecur(Node root) { 
        if (root != null) { 
            InorderRecur(root.leftST); 
            System.out.print(root.key + " "); 
            InorderRecur(root.rightST); 
        } 
    } 
    
    boolean search(int key)  { 
        root = searchRecursive(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 

    //recursive insert function
    Node searchRecursive(Node root, int key)  { 
        if (root==null || root.key==key) 
            return root; 
        if (root.key > key) 
            return searchRecursive(root.leftST, key); 
        return searchRecursive(root.rightST, key); 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PT3sample bst = new PT3sample(); 

        bst.insert(5); 
        bst.insert(13); 
        bst.insert(22); 
        bst.insert(110); 
        bst.insert(45); 
        bst.insert(38); 
        bst.insert(84); 
        //print the Binary Tree in Order
        System.out.println("\n\nIN THIS PROGRAM, YOU CAN INSERT AND DELETE 3 NODE MANUALLY\n"); 
        System.out.println("Here's the Given Binary Tree (InOrder)"); 
        bst.inorder(); 

        //Insert a node
        System.out.print("\n\nInsert a number in the Binary Tree: "); 
        int node = scanner.nextInt();
        bst.insert(node);
        System.out.println("\nHere is the updated tree: ");  
        bst.inorder(); 

        //Insert a node
        System.out.print("\n\nInsert a number in the Binary Tree: "); 
        node = scanner.nextInt();
        bst.insert(node);
        System.out.println("\nHere is the updated tree: ");  
        bst.inorder(); 

        //Insert a node
        System.out.print("\n\nInsert a number in the Binary Tree: "); 
        node = scanner.nextInt();
        bst.insert(node);
        System.out.println("\nHere is the updated tree: ");  
        bst.inorder(); 
        
        //delete one node 
        System.out.print("\n\nPick a Number to be Deleted: "); 
        int key = scanner.nextInt();
        bst.deleteNode(key);
        System.out.println("\nHere is the updated tree: ");  
        bst.inorder(); 

        //delete another node 
        System.out.print("\n\nPick a Number to be Deleted: "); 
        key = scanner.nextInt();
        bst.deleteNode(key); 
        System.out.println("\nHere is the updated tree: "); 
        bst.inorder(); 

        //delete another any node 
        System.out.print("\n\nPick a Number to be Deleted: "); 
        key = scanner.nextInt();
        bst.deleteNode(key); 
        System.out.println("\nHere is the updated tree: "); 
        bst.inorder(); 
        
        //search in the updated node after some deletion
        System.out.print("\n\nSearch a Node in the Tree: ");
        int key2 = scanner.nextInt();
        boolean ret_val = bst.search (key2);

        System.out.println("\nIs the Node in the Tree? " + ret_val );
        System.out.print("\n\n");
    }
}

//Reference: https://www.softwaretestinghelp.com/binary-search-tree-in-java/