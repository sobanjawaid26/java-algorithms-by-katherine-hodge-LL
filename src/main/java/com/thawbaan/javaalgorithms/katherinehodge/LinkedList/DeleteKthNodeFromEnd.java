package com.thawbaan.javaalgorithms.katherinehodge.LinkedList;

public class DeleteKthNodeFromEnd {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContent();
        linkedList.deleteKthNodeFromEnd(2);
        linkedList.displayContent();

        linkedList.deleteKthNodeFromEnd(1);
        linkedList.displayContent();
    }
}
