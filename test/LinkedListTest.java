import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest
{
  private LinkedList<Token> linkedList;

  @BeforeEach
  public void setUp()
  {
    linkedList = new LinkedList<>();
  }

  @Test
  public void stack_IsEmpty_Returns_true_When_Stack_Is_Empty()
  {
    assertTrue(linkedList.isEmpty());
  }

  @Test
  public void stack_IsEmpty_Returns_False_When_Stack_Has_Items()
  {
    linkedList.addToFront(new Operand(1));
    assertFalse(linkedList.isEmpty());
  }

  @Test
  public void addToFront_Can_Add_Token()
  {
    Token operand = new Operand(1);
    linkedList.addToFront(operand);
    assertEquals(linkedList.size(), 1);
    assertEquals(linkedList.removeFirst(), operand);
  }

  @Test
  public void removeFirst_Removes_The_First_Item_from_List_Does_Not_Throw_EmptyStackException()
  {
    Token operand = new Operand(1);
    linkedList.addToFront(operand);
    assertDoesNotThrow(()-> linkedList.removeFirst());
  }

  @Test
  public void removeFirst_On_Empty_List_Throws_EmptyListException()
  {
    assertThrows(EmptyStackException.class, ()-> linkedList.removeFirst());
  }

  @Test
  public void removeFirst_Removes_The_First_Item_from_List_Removes_The_Correct_Token()
  {
    Token operand1 = new Operand(1);
    linkedList.addToFront(operand1);
    Token operand2 = new Operand(2);
    linkedList.addToFront(operand2);
    assertEquals(linkedList.removeFirst(), operand2);
  }
}