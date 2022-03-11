import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
    Client client = new Client(calculatorVisitor);

    ArrayList<Token> tokens = new ArrayList<>();
    tokens.add(new Operand(1));
    tokens.add(new Operand(2));
    tokens.add(new Operator(Operation.PLUS));
    tokens.add(new Operand(2));
    tokens.add(new Operator(Operation.MULTIPLY));
    tokens.add(new Operand(2));
    tokens.add(new Operator(Operation.DIVIDE));

    int result = client.evaluateExpression(tokens);

    System.out.println(result);
  }
}
