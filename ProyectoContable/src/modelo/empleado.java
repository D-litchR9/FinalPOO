package modelo;

public class empleado extends persona {
    private String labor;
    private long id = 0;
    private String tarea;

    public empleado(String labor, long id, String tarea) {
        this.labor = labor;
        this.id = id;
        this.tarea = tarea;
    }public empleado(){};

    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public String getTarea(){return tarea;}
    public void setTarea(String tarea){this.tarea=tarea;}

    public String getLabor(){return labor;}
    public void setLabor(String labor){this.labor=labor;}












}
