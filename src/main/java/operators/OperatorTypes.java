package operators;

public enum OperatorTypes {

    ADD {
        @Override
        public Operator parse() {
            return new OperatorADD();
        }
    },
    SUB {
        @Override
        public Operator parse() {
            return new OperatorSUB();
        }
    },
    MUL {
        @Override
        public Operator parse() {
            return new OperatorMUL();
        }
    },
    DIV {
        @Override
        public Operator parse() {
            return new OperatorDIV();
        }
    };

    public abstract Operator parse();
}
