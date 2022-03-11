import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {
    private CalculatorVisitor calculatorVisitor;

@BeforeEach
    public void setUp(){
    calculatorVisitor = new CalculatorVisitor();
}

@Test
    public void get_result_return_three(){
    Operand operand = new Operand(1);
    Operand operand1 = new Operand(2);
    Operator operator = new Operator(Operation.PLUS);
    calculatorVisitor.visit(operand);
    calculatorVisitor.visit(operand1);
    calculatorVisitor.visit(operator);
    assertEquals(calculatorVisitor.getResult(),3);
}
    @Test
    public void get_result_return_zero(){
        Operand operand = new Operand(1);
        Operand operand1 = new Operand(1);
        Operator operator = new Operator(Operation.MINUS);
        calculatorVisitor.visit(operand);
        calculatorVisitor.visit(operand1);
        calculatorVisitor.visit(operator);
        assertEquals(calculatorVisitor.getResult(),0);
    }
}