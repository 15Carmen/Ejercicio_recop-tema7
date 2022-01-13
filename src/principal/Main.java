package principal;

public class Main {

    public static void main(String[] args) {

        Cubo cubo1 = new Cubo("plástico", "azul", true, 20, 50);
        Cubo cubo2 = new Cubo();
        cubo2.setMaterial("metal");

            System.out.println("El cubo tiene:" + cubo1.getContenido() + "l");
            cubo1.llenarCubo(40);
            System.out.println("Ahora el cubo tendría: " + cubo1.getContenido() + "l");



    }
}