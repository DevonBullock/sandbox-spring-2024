package org.example.sandbox.stacks;

public interface Stack<E> {
    void push(E item);
    E pop();
    E peek();
    boolean empty();
    int search(E e);
}
