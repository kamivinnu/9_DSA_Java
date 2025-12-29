package stackPackage;

import linkedListPackage.JLinkedList;

public class StackL<T> {

    private JLinkedList<T> top;
    private int size;

    StackL() {
        top = new JLinkedList<>();
        size = 0;
    }

    public void push(T data) {
        top.insertFront(data);
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        T data = top.getFront();   // ✅ get value first
        top.deleteFront();         // ✅ then delete
        size--;
        return data;               // ✅ return popped value
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return top.getFront();     // ✅ never returns null
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top.printList();
        }
    }
}
