package principal;

public class Cubo {

    //atributos

    String material, color;
    boolean asa;
    double contenido, capcidadMaxima;

    //constructor sin parametros

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

    public boolean getAsa(){
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
}
