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
     * método que devolverá un 0 si la operación se ha completado sin problemas o devolverá la cantidad de litros sobrentes
     *  si
     * precondición: litro tiene que ser > 0
     * @param litros
     */

    public double llenarCubo(double litros){

        double resultado = 0;

        if (litros > capcidadMaxima - contenido){
            this.llenarCubo();
            resultado = litros-this.capcidadMaxima;

        }else{
            this.contenido = contenido + litros;
            resultado = 0;
        }

        return resultado;
    }

    public void llenarCubo (){
        this.capcidadMaxima = this.contenido;
    }

    public void vaciarCubo (){
        this.contenido = 0;
    }

    /**
     * método que vacía el cubo comprobando que la cantidad de litros es menor o igual a la cantidad aque tiene el cubo en ese momento
     * precondición: cantidad de litros tiene que ser > 0, contenido tiene que ser >= 0
     * @param litros
     */

    public void vaciarCubo (int litros){

        if (litros < capcidadMaxima) {
            this.contenido = this.contenido - litros;
        }else{
            System.out.println("La cantidad de litros no es válida");
        }

    }

    /**
     * método que vuelca la cantidad de litros del cubo origen al cubo destino
     * comprueba la capacidad del cubo destino, en caso de que no quepa la cantidad del cubo origen el cubo destino se llenará
     *  hasta su capacidad máxima
     * precondicion:
     * @param cuboDestino
     */

    //

    public void volcarCubo (Cubo cuboDestino){

        double resultado;

        resultado = cuboDestino.llenarCubo(this.contenido);
        if (resultado == 0){ //Esto significa que todo ha ido bien y que por lo tanto todo el cubo origen se ha vaciado en el cubo destino
            this.vaciarCubo();
        }else{
            this.vaciarCubo();
            this.llenarCubo(resultado);
        }
    }

    //metodo para dibujar cubo


}
