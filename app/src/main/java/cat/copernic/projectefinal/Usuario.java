package cat.copernic.projectefinal;

import java.io.Serializable;

/**
 * Created by Francisco on 19/05/2015.
 */
public class Usuario implements Serializable{



    String nombre;
    String contraseña;

    boolean calefaccion;
    boolean aireAcondicionado;

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Usuario(String nombre, String contraseña,  boolean calefaccion, boolean aireAcondicionado) {

        this.nombre = nombre;
        this.contraseña = contraseña;
        this.calefaccion = calefaccion;
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", calefaccion=" + calefaccion +
                ", aireAcondicionado=" + aireAcondicionado +
                '}';
    }
}
