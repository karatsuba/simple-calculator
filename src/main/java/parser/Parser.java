package parser;

import operand.Operand;
import operators.Operator;
import operators.OperatorTypes;

public class Parser {

    public Context parse(String[] args) throws Exception{
        if (args.length == 0){
            throw new Exception("ERROR: provide operator and operands, please.");
        }

        Context.ContextBuilder context = new Context.ContextBuilder();

        try {
            Operator operator = OperatorTypes.valueOf(args[0]).parse();
            context.operator(operator);
        } catch (IllegalArgumentException e) {
            throw new Exception("ERROR: there is no '" + args[0] + "' command.");
        }

        try {
            Operand leftOperand = new Operand(args[1]).parse();
            context.leftOperand(leftOperand);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("ERROR: provide left operand, please.");
        }

        try {
            Operand rightOperand = new Operand(args[2]).parse();
            context.rightOperand(rightOperand);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("ERROR: provide right operand, please.");
        }

        return context.build();
    }
}
