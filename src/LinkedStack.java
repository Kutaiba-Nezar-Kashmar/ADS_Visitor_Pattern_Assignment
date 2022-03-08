import java.util.EmptyStackException;

/**
 * Stack implementation using (Singly) LinkedList.
 * Pop and Push operations will happen at front of LinkedList for O(1) time complexity.
 * */
public class LinkedStack<T> implements Stack<T> {
    LinkedList<T> list = new LinkedList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T elm) {
        list.addToFront(elm);
    }

    @Override
    public T pop() throws EmptyStackException {
        try{
            return list.removeFirst();
        }catch(EmptyStackException e){
            e.printStackTrace();
            throw e;
        }
    }
}