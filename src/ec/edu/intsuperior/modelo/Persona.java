
package ec.edu.intsuperior.modelo;

public class Persona {
    String id;
        String nombre;
        String apellido;
        String direccion;
        public enum TipoGenero{
            MASCULINO, FEMENINO
        }
        TipoGenero genero;

    public Persona() {
    }

     Persona(String id, String nombre, String apellido, String direccion, TipoGenero genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoGenero getGenero() {
        return genero;
    }

}
