package parser;

import operand.Operand;
import operators.Operator;

public class Context {

    private Operator operator;
    private Operand leftOperand;
    private Operand rightOperand;

    private Context(ContextBuilder builder) {
        this.operator = builder.operator;
        this.leftOperand = builder.leftOperand;
        this.rightOperand = builder.rightOperand;
    }

    public Number evaluate() throws Exception {
        return this.operator.evaluate(this.leftOperand, this.rightOperand);
    }

    public static class ContextBuilder {

        private Operator operator;
        private Operand leftOperand;
        private Operand rightOperand;

        public ContextBuilder operator(Operator operator) {
            this.operator = operator;
            return this;
        }

        public ContextBuilder leftOperand(Operand leftOperand) {
            this.leftOperand = leftOperand;
            return this;
        }

        public ContextBuilder rightOperand(Operand rightOperand) {
            this.rightOperand = rightOperand;
            return this;
        }

        public Context build() {
            return new Context(this);
        }
    }


}
