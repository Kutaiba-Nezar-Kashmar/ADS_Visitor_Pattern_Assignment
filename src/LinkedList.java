import java.util.EmptyStackException;

public class LinkedList<T> implements List<T>
{
  private Node<T> head;
  private int size;

  public LinkedList()
  {
    size = 0;
  }

  public LinkedList(Node head, int size)
  {
    this.head = head;
    this.size = size;
  }

  @Override public boolean isEmpty()
  {
    return size == 0;
  }

  @Override public int size()
  {
    return size;
  }

  @Override public void addToFront(T data)
  {
    if (head == null)
    {
      head = new Node<T>(data);
      size++;
      return;
    }

    Node node = new Node();
    node.setData(data);
    node.setNext(head);
    head = node;
    size++;
  }

  @Override public T removeFirst() throws EmptyStackException
  {
    if (head == null)
    {
      throw new EmptyStackException();
    }

    T tem = head.getData();
    head = head.getNext();
    size--;
    return tem;
  }
}
