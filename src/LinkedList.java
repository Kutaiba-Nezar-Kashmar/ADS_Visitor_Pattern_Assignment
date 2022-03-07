import java.util.EmptyStackException;

public class LinkedList<T> implements List<T>
{
    private Node<T> head;
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
    public void addToFront(T data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;
        size++;
    }

    @Override
    public T removeFirst() throws EmptyStackException {
    T tem = head.getData();
    head = head.getNext();
    size--;
    return tem;

    }
}
