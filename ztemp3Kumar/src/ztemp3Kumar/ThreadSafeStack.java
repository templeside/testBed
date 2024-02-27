package ztemp3Kumar;
import java.util.concurrent.locks.ReentrantLock; 

public class ThreadSafeStack<T> {
    private Node<T> top;
    private final ReentrantLock lock = new ReentrantLock();

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        lock.lock();
        try {
            Node<T> newNode = new Node<>(item);
            newNode.next = top;
            top = newNode;
        } finally {
            lock.unlock();
        }
    }

    public T pop() {
        lock.lock();
        try {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            T data = top.data;
            top = top.next;
            return data;
        } finally {
            lock.unlock();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
    
    public static void main(String[] args) {
    	ThreadSafeStack<String> stack = new ThreadSafeStack<>();

    	stack.push("Hello");
    	stack.push("World");

    	String value = stack.pop();
    	System.out.println(value); // prints "World"

    	value = stack.pop();
    	System.out.println(value); // prints "Hello"

    }
}
