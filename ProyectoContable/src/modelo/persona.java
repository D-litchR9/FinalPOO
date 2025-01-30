package modelo;

public class persona {
    private String nombre;
    private long cedula = 0;
    private long numeroCelular;

    public persona(String nombre, long cedula, long numeroCelular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroCelular = numeroCelular;
    }public persona(){};

    //Getters y setters de la clase persona
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public long getCedula(){return cedula;}
    public void setCedula(long cedula){this.cedula = cedula;}


    public long getNumeroCelular() {return numeroCelular;}
    public void setNumeroCelular(long numeroCelular) {this.numeroCelular = numeroCelular;}
}
