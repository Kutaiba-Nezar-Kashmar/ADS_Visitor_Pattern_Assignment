import java.util.EmptyStackException;

public class LinkedList implements List
{
    private Node head;
    private int size;

public LinkedList(Node head, int size){
    this.head = head;
    this.size = size;
}


    @Override
    public boolean isEmpty() {
         return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(Object data) {

    }

    @Override
    public Object removeFirst() throws EmptyStackException {
        return null;
    }
}
