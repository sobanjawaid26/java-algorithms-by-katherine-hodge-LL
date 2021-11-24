package com.thawbaan.javaalgorithms.katherinehodge.LinkedList;

import java.util.HashSet;

public class CustomLinkedList {

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
    }
}

class Node {
    public int data;
    public Node next;
    public Node(int d){data = d;}
}
class LinkedList {
    Node head;

    public void displayContent() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf() {

        if(head == null || head.next == null){
            head = null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
    }

    public void deleteKthNodeFromEnd(int k){

        if(head == null || k == 0){
            return;
        }

        // list = [a, b, c, d]; k = 2
        Node first = head;
        Node second = head;

        for(int i = 0; i< k; i++){
            second = second.next;
            if(second.next == null){
                // K >= lenth of list
                if(i == k - 1){
                    head = head.next;
                }
                return;
            }
        }
        // second = c
        while(second.next != null){
            first = first.next;
            second = second.next;
        }
        // first = b
        // second = d
        first.next = first.next.next;
    }

    public boolean hasCycle(){
        HashSet<Node> nodes = new HashSet<>();
        Node current = head;
        while(current != null) {
            if(nodes.contains(current)){
                return true;
            } else {
                nodes.add(current);
            }
            current = current.next;
        }
        return false;
    }
}
