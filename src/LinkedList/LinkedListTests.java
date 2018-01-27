package LinkedList;

import org.junit.Test;

public class LinkedListTests {

    @Test

    public void test () {

        MyLinkedList list = new MyLinkedList();

        list.add(15);
        list.add(16);
        list.add(10);

        System.out.println("Does 10 exist in the list? " + list.find(10));
        System.out.println("Does 16 exist in the list? " + list.find(16));
        System.out.println("Does 17 exist in the list? " + list.find(17));
        System.out.println("Does 20 exist in the list? " + list.find(20));
        System.out.println("Does 1 exist in the list? " + list.find(1));

        System.out.println("Done");


    }
}
