import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    Operand operand;


    @Test
    void getValueNormalValueReturnsExpected() {
        //arrange
        operand = new Operand(1);
        //act

        //assert
        assertEquals(1, operand.getValue());
    }

    @Test
    void getValueNegativeValueReturnsExpected() {
        //arrange
        operand = new Operand(-1);
        //act

        //assert
        assertEquals(-1, operand.getValue());
    }


}