
package biblioteca;

public class Empleado {
    private String nombre;
    private String apellido;
    private float sueldo;
    
    public Empleado(String nombre, String apellido, float sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }
    public void mostrarEmpleado(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Sueldo: " + this.sueldo);
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
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
