package org.example.sandbox.linklist;



import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>{

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {
        Node newNode = new Node(element, head);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            head = newNode;
        }


    }

    @Override
    public void addLast(E element) {
        Node newNode = new Node(element, null);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    @Override
    public E pollFirst() {

        E element;
        if (head == null) {
            element = null;
        } else {

            element = head.element;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node next = head.next;
                head.next = null;
                head = next;
            }
        }
        return element;
    }

    @Override
    public E pollLast() {

        E element;

        if(tail == null) {
            element = null;
        } else {
            element = tail.element;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
        }
        return element;
    }

    @Override
    public E peekFirst() {
        E returnValue = null;
        if (head != null) {
            returnValue = returnValue;
        }
        return head.element;
    }

    @Override
    public E peekLast() {
        E returnValue = null;
        if (tail != null) {
            returnValue = tail.element;
        }
        return returnValue;
    }

    @Override
    public void clear() {

        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            current = next;
        }
        head = null;
        tail = null;

    }

    @Override
    public boolean contains(E element) {

        boolean found = false;
        Node current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                found = true;
                break;
            }
            current = current.next;
        }
        return found;
    }

    @Override
    public int size() {
        int counter = 0;
        if(head != null) {
                Node current = head;
                while (current != null) {
                    counter++;
                    current = current.next;
                }
            }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;
        if (current != null) {
            while (current.next != null) {
                joiner.add(current.element.toString());
                current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {

        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
