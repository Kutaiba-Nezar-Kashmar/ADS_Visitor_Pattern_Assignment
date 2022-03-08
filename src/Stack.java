import java.util.EmptyStackException;

public interface Stack<T> {
    /**
     * Checks if stack is empty
     * @return true if empty, else false
     * */
    boolean isEmpty();

    /**
     * Pushes element to top of stack
     *
     * @param elm element to be pushed onto stack
     * */
    void push(T elm);

    /**
     * Removes and retrieves element from the top of stack
     *
     * @return top element of stack
     * @throws EmptyStackException if stack is empty when <c>pop()</c> is called
     * */
    T pop() throws EmptyStackException;
}
