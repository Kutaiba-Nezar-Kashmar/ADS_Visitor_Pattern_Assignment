import java.util.EmptyStackException;


public class LinkedStack<T> implements Stack<T> {
    LinkedList<T> list;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(T elm) {

    }

    @Override
    public T pop() throws EmptyStackException {
        return null;
    }
}