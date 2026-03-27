import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RepositorioDeFiguras2D {
    private List<FiguraGeometrica2D> figuras;

    public RepositorioDeFiguras2D() {
        figuras = new ArrayList<>();
    }

    public void adicionar(FiguraGeometrica2D f) {
        figuras.add(f);
    }

    public void remover(int posicao) {
        figuras.remove(posicao);
    }

    public double getArea(int posicao) {
        return figuras.get(posicao).getArea();
    }

    public double getPerimetro(int posicao) {
        return figuras.get(posicao).getPerimetro();
    }

    public String getTipo(int posicao) {
        return figuras.get(posicao).getTipo();
    }

    public void ordenarPorArea() {
        Collections.sort(figuras);
    }
}