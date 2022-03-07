import java.util.EmptyStackException;

public class LinkedList<T> implements List
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
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;

    }

    @Override
    public Object removeFirst() throws EmptyStackException {
        return head = head.getNext();

    }
}
