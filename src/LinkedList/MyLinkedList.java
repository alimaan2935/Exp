package LinkedList;

public class MyLinkedList {


    Node head;
    Node tail;

    public void add (int data) {

        Node node = new Node(data);


        if (tail == null) {
            head = node;
            tail = node;
        }else {
            tail.setNextNode(node);
            tail = node;
        }


    }

    public Node delete(int data) {



        Node node = find(data);

        if (node != null) {

            if (tail == node) {

                return null;

            }
        }

        return null;

    }

    public Node find(int data) {

        if (head == null) {
            return null;
        }
        if (head.getData() == data) {
            return head;
        }

        Node node = head;

        while (head.getNextNode() != null) {

            node = node.nextNode;
            if (node.data == data) {
                return node;
            }
        }
        return null;

    }


}
