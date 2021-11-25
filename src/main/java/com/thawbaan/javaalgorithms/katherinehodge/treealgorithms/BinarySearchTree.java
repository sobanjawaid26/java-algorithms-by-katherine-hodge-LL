package com.thawbaan.javaalgorithms.katherinehodge.treealgorithms;

public class BinarySearchTree {

    Node root;

    public void insert(int value){
        insert(this.root, value);
    }

    private Node insert(Node root, int value){
        if (root == null){
            root = new Node();
            root.data = value;
        } else if(value < root.data){
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data){
            // insert on right
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void preOrderTraversal(){
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node root){
        if (root != null){
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void inOrderTraversal(){
        inOrderTraversal(this.root);
    }
    private void inOrderTraversal(Node root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(){
        postOrderTraversal(this.root);
    }
    private void postOrderTraversal(Node root){
        if (root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public boolean contains(int value){
        return contains(this.root, value);
    }
    public  boolean contains(Node node, int value){
        if(root == null){
            return false;
        }
        if(value < root.data){
            return contains(root.left, value);
        }
        if(value > root.data){
            return contains(root.right, value);
        }

        return true;
    }



    public static void main(String[] args) {
        Node rootNode = new Node();
        rootNode.data = 5;
        Node nodeTwo = new Node();
        rootNode.data = 2;
        Node nodeFour = new Node();
        rootNode.data = 4;
        Node nodeNine = new Node();
        rootNode.data = 9;
        Node nodeTen = new Node();
        rootNode.data = 10;
        Node nodeSeven = new Node();
        rootNode.data = 7;

        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTen.right = nodeTen;
        nodeFour.left = nodeSeven;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.preOrderTraversal();
        System.out.println("END");

        System.out.println("conatins start");
        rootNode = new Node();
        rootNode.data = 2;

        tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);

        System.out.println(tree.contains(2));
        System.out.println(tree.contains(3));
        System.out.println(tree.contains(4));

        System.out.println(tree.contains(5));
        System.out.println(tree.contains(-4));
        System.out.println(tree.contains(0));
        System.out.println(tree.contains(6));

    }


}
