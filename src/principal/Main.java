package principal;

public class Main {

    public static void main(String[] args) {

        Cubo cubo1 = new Cubo("plástico", "azul", true, 20, 50);

        System.out.println("El cubo tiene:" + cubo1.getContenido() + "cl");
        cubo1.llenarCubo();

    }
}
