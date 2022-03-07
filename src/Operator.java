public class Operator extends Token {

    Operation operation;

    public void accept(CalculatorVisitor visitor)
    {

    }


    public Operation getOperation()
    {
       return operation;
    }
}
