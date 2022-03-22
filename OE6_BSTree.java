/*
Paolo D
CS 2-1 | OE6 "Implement Binary Search Tree Traversals PreOrder, InOrder, and PostOrder in Java"
*/

//class to create nodes
class Node{
    int key;
    Node leftST, rightST;

    public Node(int data){
        key = data;
        leftST = rightST = null;
    }
}

public class OE6_BSTree{
    Node root;

    //PreOrder traversal
    public void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.key + " "); // Will print at the 1st time it reached the node
            preOrderTraversal(node.leftST);
            preOrderTraversal(node.rightST);
        }
    }

    //InOrder traversal
    public void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.leftST);
            System.out.print(" " + node.key); // Will print at the 2nd time it reached the node
            inOrderTraversal(node.rightST);
        }
    }

    //PostOrder traversal
    public void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.leftST);
            postOrderTraversal(node.rightST);
            System.out.print(node.key + " "); // Will print at the 3rd time it reached the node
        }
    }

    public static void main(String[] args) {
        //Instance of the tree
        bstree myTree = new bstree();

        //create nodes
        myTree.root = new Node(1);
        myTree.root.leftST = new Node(2);
        myTree.root.rightST = new Node(3);
        myTree.root.leftST.leftST = new Node(4);
        myTree.root.rightST.rightST = new Node(5);

        System.out.print("\n\nBinary Search Tree Traversals\n");

        System.out.print("\nBinary Tree Pre Order : ");
        myTree.preOrderTraversal(myTree.root); //call PreOrderTraversal

        System.out.print("\nBinary Tree In Order  :");
        myTree.inOrderTraversal(myTree.root); //call inOrderTraversal

        System.out.print("\nBinary Tree Post Order: ");
        myTree.postOrderTraversal(myTree.root); //call PostOrderTraversal

        System.out.println("\n");
    }
}