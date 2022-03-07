import jdk.nashorn.internal.parser.Token;

public class CalculatorVisitor implements Visitor, Calculator
{

  private LinkedStack<Token> tokenStack;

  public CalculatorVisitor(LinkedStack<Token> tokenStack)
  {
    this.tokenStack = tokenStack;
  }

  public void pushOperand(Operand operand)
  {

  }

  public void performOperation(Operation operation) throws MalformedExpressionException
  {

  }

  @Override public int getResult() throws MalformedExpressionException
  {
    return 0;
  }

  @Override public void visit(Operand operand)
  {

  }

  @Override public void visit(Operator operator)
  {

  }
}
