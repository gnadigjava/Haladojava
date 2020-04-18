public class CalculatorModel {

    private double a;
    private double b;
    private String op;

    public CalculatorModel() {

    }

    public CalculatorModel(String op) {
        this.op = op;
    }

    public CalculatorModel(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}