package com.thawbaan.javaalgorithms.katherinehodge.queuestack;

import java.util.LinkedList;
import java.util.Queue;


public class QueueCustom {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(19);
        queue.add(20);

        System.out.println(queue);
        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());
        System.out.println(queue);
        queue.add(21);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);

        queue.add(22);
        queue.add(23);
        queue.add(24);
        queue.add(25);

        System.out.println("While loop starting");
        while(!queue.isEmpty()) {
//            System.out.println(queue.remove());
            queue.remove();
            System.out.println(queue);
        }

        System.out.println("While loop completed");
        System.out.println(queue);

    }
}
