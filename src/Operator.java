public class Operator extends Token {

    Operation operation;

    public Operator(Operation operation) {
        if (operation==null)
            throw new RuntimeException("Operation cannot bu null");
        this.operation = operation;
    }

    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }


    public Operation getOperation() {
        return operation;
    }


}
