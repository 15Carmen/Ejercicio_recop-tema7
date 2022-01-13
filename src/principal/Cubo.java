package principal;

public class Cubo {

    //atributos

    String material, color;
    boolean asa;
    double contenido, capcidadMaxima;

    //constructor sin parametros (o por defecto)

    public Cubo(){

        this.material = "plástico";
        this.asa = false;
        this.color = "negro";
        this.capcidadMaxima = 10;
        this.contenido = 0;

    }

    //constructor con parámetros

    public Cubo (String material, String color, boolean asa, double contenido, double capcidadMaxima){

        this.material = material;
        this.color = color;
        this.asa = asa;
        this.contenido = contenido;
        this.capcidadMaxima = capcidadMaxima;

    }

    //hacemos getter

    public String getMaterial(){
        return material;
    }

    public String getColor(){
        return color;
    }

    public boolean isAsa(){
        return asa;
    }

    public double getContenido(){
        return contenido;
    }

    public double getCapcidadMaxima(){
        return capcidadMaxima;
    }

    //hacemos los setter

    public void setMaterial (String material){
        this.material = material;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setAsa (boolean asa){
        this.asa = asa;
    }

    public void setContenido (double contenido){
        this.contenido = contenido;
    }

    public void setCapcidadMaxima (double capcidadMaxima){
        this.capcidadMaxima = capcidadMaxima;
    }

    //constructor copia

    public Cubo (Cubo cubo){

        this.material = cubo.getMaterial();
        this.color = cubo.getColor();
        this.asa = cubo.isAsa();
        this.contenido = cubo.getContenido();
        this.capcidadMaxima = cubo.getCapcidadMaxima();

    }

    /**
     * método que comprueba que el contenido actual no será mayor a capacidadMaxima y si no lo es, sumará la cantidad de litros recibidos
     * precondición: litro tiene que ser > 0
     * @param litro
     */

    public void llenarCubo(int litro){

        contenido += litro;

        if (capcidadMaxima==contenido){
            System.out.println("El cubo está lleno a su máxima capacidad");
        }else if (capcidadMaxima>contenido){
            System.out.println("El cubo puede llenarse más");
        }else if (capcidadMaxima<contenido){
            System.out.println("El agua ha rebosado del cubo :(");
        }

    }

    //metodo para vaciar el cubo

    public void vaciarCubo (int cantidad){

        contenido-=cantidad;

        if (contenido == 0) {
            System.out.println("El cubo está vacío");
        }

    }

    //metodo para volcar agua de un cubo a otro

    public void volcarContenido (int cantidadVolcar, Cubo cubo){

        cubo.contenido+=cantidadVolcar;
        this.contenido-=cantidadVolcar;

        if (capcidadMaxima < cubo.contenido){
            System.out.println("El agua del cubo ha rebosado");
        }else{

        }

    }

    //metodo para dibujar cubo
}
