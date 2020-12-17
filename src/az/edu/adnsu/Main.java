package az.edu.adnsu;

import az.edu.adnsu.linkedList.MyLinkedList;
import az.edu.adnsu.linkedList.Node;

public class Main {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.insertToEnd(2);
        linkedList.insertAtHead(1);
        linkedList.insertToEnd(3);

        System.out.println(linkedList.indexOf(2));

    }

}
