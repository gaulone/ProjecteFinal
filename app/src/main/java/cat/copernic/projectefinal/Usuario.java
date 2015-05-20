package cat.copernic.projectefinal;

/**
 * Created by Francisco on 19/05/2015.
 */
public class Usuario {

    String nombre;
    String contraseña;

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public Usuario(String nombre, String contraseña) {
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
