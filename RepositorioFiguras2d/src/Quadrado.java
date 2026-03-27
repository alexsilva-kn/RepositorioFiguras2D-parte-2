public class Quadrado implements FiguraGeometrica2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public String getTipo() {
        return "Quadrado";
    }

    public int compareTo(FiguraGeometrica2D outra) {
        return Double.compare(this.getArea(), outra.getArea());
    }
}