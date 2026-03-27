public class Circulo implements FiguraGeometrica2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * raio * raio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String getTipo() {
        return "Circulo";
    }

    public int compareTo(FiguraGeometrica2D outra) {
        return Double.compare(this.getArea(), outra.getArea());
    }
}