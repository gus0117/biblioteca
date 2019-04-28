
package biblioteca;

public class Socio {
    private String nombre;
    private String apellido;
    private int lu;
    
    public Socio(String nombre, String apellido, int lu){
        this.nombre = nombre;
        this.apellido = apellido;
        this.lu = lu;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the lu
     */
    public int getLu() {
        return lu;
    }

    /**
     * @param lu the lu to set
     */
    public void setLu(int lu) {
        this.lu = lu;
    }
    
    
}
