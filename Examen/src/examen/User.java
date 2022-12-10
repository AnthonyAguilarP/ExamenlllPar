package examen;

import java.io.Serializable;

public class User implements Serializable{
   private String nombre, id, contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public User(String nombre, String id, String contra) {
        this.nombre = nombre.toLowerCase();
        this.id = id.toLowerCase();
        this.contra = contra;
    }
   
}
