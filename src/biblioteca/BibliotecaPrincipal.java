
package biblioteca;

import java.util.Scanner;


public class BibliotecaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado emp1 = new Empleado("Jorge","Perez",15000);
        Empleado emp2 = new Empleado("Pablo","Pacheco",20000);
        Empleado emp3 = new Empleado("Gimena","Flores",34000);
        
        System.out.println("Empleado 1");
        System.out.println("Nombre: " + emp1.getNombre());
        System.out.println("Apellido: " + emp1.getApellido());
        System.out.println("Sueldo: " + emp1.getSueldo());
        
        System.out.println("Empleado 2");
        System.out.println("Nombre: " + emp2.getNombre());
        System.out.println("Apellido: " + emp2.getApellido());
        System.out.println("Sueldo: " + emp2.getSueldo());
        
        System.out.println("Empleado 3");
        System.out.println("Nombre: " + emp3.getNombre());
        System.out.println("Apellido: " + emp3.getApellido());
        System.out.println("Sueldo: " + emp3.getSueldo());
        
        Libro libro1 = new Libro("It","Stephen King","Bolsillo");
        Libro libro2 = new Libro("Astronomia 1","Carl Sagan","Quantum");
        Libro libro3 = new Libro("Cuentos","Lovecraft","El trebol");
        
        System.out.println("Libro 1");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Editorial: " + libro1.getEditorial());
        
        System.out.println("Libro 2");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Editorial: " + libro2.getEditorial());
        
        System.out.println("Libro 3");
        System.out.println("Titulo: " + libro3.getTitulo());
        System.out.println("Autor: " + libro3.getAutor());
        System.out.println("Editorial: " + libro3.getEditorial());
        
        Socio socio1 = new Socio("Alicia","Romero",1132);
        Socio socio2 = new Socio("Juana","Pereira",3124);
        Socio socio3 = new Socio("Agustin","Maidana",5123);
        
        System.out.println("Socio 1");
        System.out.println("Nombre: " + socio1.getNombre());
        System.out.println("Apellido: " + socio1.getApellido());
        System.out.println("LU: " + socio1.getLu());

        System.out.println("Socio 2");
        System.out.println("Nombre: " + socio2.getNombre());
        System.out.println("Apellido: " + socio2.getApellido());
        System.out.println("LU: " + socio2.getLu());
        
        System.out.println("Socio 3");
        System.out.println("Nombre: " + socio3.getNombre());
        System.out.println("Apellido: " + socio3.getApellido());
        System.out.println("LU: " + socio3.getLu());
    }
    
}
