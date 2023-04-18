public class Lado {
    double lado1;
    public void setLado(double lado1) {
        this.lado1 = lado1;
    }
    public double getPerimetro() {
        return 3 * lado1;
    }
    public double getAltura() {
        return Math.sqrt(3)/2 * lado1;
    }
    public double getArea() {
        return Math.sqrt(3)/4 * Math.pow(lado1,2);
    }
}
