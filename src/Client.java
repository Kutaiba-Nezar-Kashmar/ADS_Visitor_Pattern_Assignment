import java.util.ArrayList;

public class Client {
    private CalculatorVisitor calculatorVisitor;

    public Client(CalculatorVisitor calculatorVisitor) {
        this.calculatorVisitor = calculatorVisitor;
    }

    public int evaluateExpression(ArrayList<Token> tokenList) {
        for (Token token : tokenList) {
            token.accept(this.calculatorVisitor);
        }

        return this.calculatorVisitor.getResult();
    }
}
