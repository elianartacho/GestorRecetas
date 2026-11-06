import java.io.Serializable;
import java.util.ArrayList;

public class Receta implements Serializable {
    private static int contadorId = 1;
    private int id;
    private String nombre;
    private String descripcion;
    private int tiempoNecesario;
    private ArrayList<String> ingredientes;

    public Receta() {

    }

    public Receta(String nombre, ArrayList<String> ingredientes, String descripcion, int tiempoNecesario) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
        this.tiempoNecesario = tiempoNecesario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoNecesario() {
        return tiempoNecesario;
    }

    public void setTiempoNecesario(int tiempoNecesario) {
        this.tiempoNecesario = tiempoNecesario;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ingredientes=" + ingredientes +
                ", tiempoNecesario=" + tiempoNecesario +
                '}';
    }
}
