package com.thawbaan.javaalgorithms.katherinehodge.LinkedList;

public class DeleteBackHalfOfALinkedList {

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
        linkedList.deleteBackHalf();
        linkedList.displayContent();

    }
}