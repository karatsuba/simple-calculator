package operators;

import operand.Operand;

public class OperatorMUL implements Operator{

    public Number evaluate(Operand leftOperand, Operand rightOperand) {
        return leftOperand.getValue() * rightOperand.getValue();
    }

    public String toString() {
        return "MUL";
    }
}
