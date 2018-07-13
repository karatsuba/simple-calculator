package operators;

import operand.Operand;

public class OperatorDIV implements Operator{

    public Number evaluate(Operand leftOperand, Operand rightOperand) throws Exception{
        if (rightOperand.getValue() == 0){
            throw new Exception("ERROR: you can divide by zero");
        }
        return leftOperand.getValue() / rightOperand.getValue();
    }

    public String toString() {
        return "DIV";
    }

}
