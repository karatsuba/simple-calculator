package operand;

public class Operand {

    private String token;
    private Number value;

    public Operand(String token) {
        this.token = token;
    }

    public Operand parse() throws Exception {
        try {
            this.value = Double.valueOf(this.token);
        } catch (NumberFormatException e) {
            throw new Exception("ERROR: can't parse " + this.token);
        }

        return this;
    }

    public double getValue() {
        return this.value.doubleValue();
    }
}
