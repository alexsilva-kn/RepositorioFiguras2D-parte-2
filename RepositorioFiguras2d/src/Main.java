public class Main {
    public static void main(String[] args) {

        RepositorioDeFiguras2D repo = new RepositorioDeFiguras2D();

        repo.adicionar(new Circulo(2.0));
        repo.adicionar(new Quadrado(3.0));

        System.out.println(repo.getTipo(0));
        System.out.println(repo.getArea(0));
        System.out.println(repo.getPerimetro(0));

        System.out.println(repo.getTipo(1));
        System.out.println(repo.getArea(1));
        System.out.println(repo.getPerimetro(1));
    }
}