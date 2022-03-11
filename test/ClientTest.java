import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client;

    @BeforeEach
    public void setup(){
        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        client = new Client(calculatorVisitor);
    }

    @Test
    public void evaluateExpression_OnePlusTwo_ReturnsThree(){
        // Arrange
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList.add(new Operand(1));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.PLUS));

        // Act
        int result = client.evaluateExpression(tokenList);

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void evaluateExpression_OnePlusTwo_MultipliedByTwo_ReturnsSix(){
        // Arrange
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList.add(new Operand(1));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.PLUS));
        tokenList.add(new Operand(2));
        tokenList.add(new Operator(Operation.MULTIPLY));

        // Act
        int result = client.evaluateExpression(tokenList);

        // Assert
        assertEquals(6, result);
    }

}