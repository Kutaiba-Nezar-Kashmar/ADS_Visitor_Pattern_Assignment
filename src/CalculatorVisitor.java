public class CalculatorVisitor implements Visitor, Calculator
{

  private LinkedStack<Token> tokenStack = new LinkedStack<>();

  private void pushOperand(Operand operand)
  {
    tokenStack.push(operand);
  }

  private void performOperation(Operator operator)
      throws MalformedExpressionException
  {
    int right = ((Operand) tokenStack.pop()).getValue();
    int left = ((Operand) tokenStack.pop()).getValue();

    switch (operator.getOperation())
    {
      case PLUS:
        Operand operand0 = new Operand(left + right);
        tokenStack.push(operand0);
        break;
      case MINUS:
        Operand operand1 = new Operand(left - right);
        tokenStack.push(operand1);
        break;
      case MULTIPLY:
        Operand operand2 = new Operand(left * right);
        tokenStack.push(operand2);
        break;
      case DIVIDE:
        if (right == 0)
        {
          throw new MalformedExpressionException(
              "Cant divide by zero...Try again");
        }
        Operand operand3 = new Operand(left / right);
        tokenStack.push(operand3);
        break;
      default:
        break;
    }
  }

  @Override public int getResult() throws MalformedExpressionException
  {
    return ((Operand) tokenStack.pop()).getValue();
  }

  @Override public void visit(Operand operand)
  {
    pushOperand(operand);
  }

  @Override public void visit(Operator operator)
  {
    performOperation(operator);
  }
}
