import parser.Context;
import parser.Parser;

public class Calculator {

    public static Number calculate(String[] args) throws Exception {
        Parser parser = new Parser();
        try {
            Context context = parser.parse(args);
            return context.evaluate();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            Number result = Calculator.calculate(args);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
