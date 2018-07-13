package operators;

import operand.Operand;

public interface Operator {
    Number evaluate(Operand leftOperand, Operand rightOperand) throws Exception;
}
