import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    Operator operator;

    @Test
    void getOperation_Multiply_returnsMultiply() {
        operator = new Operator(Operation.MULTIPLY);
        assertEquals(operator.getOperation(), Operation.MULTIPLY);
    }

    @Test
    void getOperation_Plus_returnsPlus() {
        operator = new Operator(Operation.PLUS);
        assertEquals(operator.getOperation(), Operation.PLUS);
    }

    @Test
    void getOperation_Minus_returnsMinus() {
        operator = new Operator(Operation.MINUS);
        assertEquals(operator.getOperation(), Operation.MINUS);
    }

    @Test
    void getOperation_Divide_returnsDivide() {
        operator = new Operator(Operation.DIVIDE);
        assertEquals(operator.getOperation(), Operation.DIVIDE);
    }

    @Test
    void getOperation_null_returnsDivide() {
        assertThrows(RuntimeException.class, () -> operator = new Operator(null));
    }
}