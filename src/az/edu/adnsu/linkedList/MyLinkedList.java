package az.edu.adnsu.linkedList;

public class MyLinkedList {

    public Node head; // by default it is null
    public Node tail; // by default it is null

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertToEnd(int value) {

        Node node = new Node(value);

        if (head == null && tail == null) {
            head = node;
            tail = head;
        } else {
            tail.nextItem = node;
            tail = tail.nextItem;
        }

    }

    public void insertAtHead(int value) {

        Node node = new Node(value);

        if (head == null && tail == null) {
            head = node;
            tail = head;
        } else {
            node.nextItem = head;
            head = node;
        }

    }

    public int indexOf(int value) {

        int index = 0;

        Node tmp = head;

        while (tmp != null) {

            if(tmp.data == value) {
                return index;
            }

            index += 1;
            tmp = tmp.nextItem;

        }

        return -1;

    }

}
