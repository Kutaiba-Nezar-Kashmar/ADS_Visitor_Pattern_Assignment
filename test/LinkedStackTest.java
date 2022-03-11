import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {
    private LinkedStack<Token> linkedStack;

    @BeforeEach
    public void setup(){
        linkedStack = new LinkedStack<>();
    }

    @Test
    public void isEmpty_ListIsEmpty_ReturnsTrue(){
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    public void isEmpty_ListIsNotEmpty_ReturnsFalse(){
        // Arrange
        Token token = new Operand(0);

        // Act
        linkedStack.push(token);

        //Assert
        assertFalse(linkedStack.isEmpty());
    }

    @Test
    public void pop_ListIsEmpty_ThrowsEmptyStackException(){
        assertThrows(EmptyStackException.class, ()->{
           linkedStack.pop();
        });
    }

    @Test
    public void pop_ListContainsOneElement_RetrievesCorrectElement(){
        // Arrange
        Token token = new Operand(2);
        linkedStack.push(token);

        // Act
        Token retrievedToken = linkedStack.pop();

        // Assert
        assertEquals(token, retrievedToken);
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    public void pop_ListContainsTwoElements_RetrievesLastPushedElement(){
        // Arrange
        Token first = new Operand(2);
        Token second = new Operand(3);

        linkedStack.push(first);
        linkedStack.push(second);

        // Act
        Token retrievedToken = linkedStack.pop();

        // Assert
        assertEquals(second, retrievedToken);
    }

    
}