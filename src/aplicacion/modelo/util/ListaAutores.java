/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que sirve de Data Source para la clase Autor
 */
public class ListaAutores {
    /**
     * Lista de autores
     */
    private List<Autor> autores;
    
    /**
     * Constructor que inicializa la lista;
     */
    public ListaAutores(){
        autores = new ArrayList<Autor>();
        
        //Se inicializa la lista con algunos autores conocidos
        autores.add(new Autor(111,"Stephen","King"));
        autores.add(new Autor(222,"Julio","Cortazar"));
        autores.add(new Autor(333,"Alan","Poe"));
    }
    /**
     * Agrega un nuevo Autor a la lista de autores
     * @param autor objeto autor a agregar
     */
    public void agregarAutor(Autor autor){
        //Deberia buscar que el autor no se repita?
        autores.add(new Autor(autor.getId(), autor.getNombre(), autor.getApellido()));
    }
    
    /**
     * Obtiene el indice de un objeto autor dentro de un ArrayList.
     * En caso de no encontrarlo devuelve -1.
     * @param autor objeto a buscar en la lista de autores
     * @return delvuelve el indice dentro del ArrayList. -1 si no lo encontro
     */
    private int obtenerIndiceAutor(Autor autor){
        for(int i = 0; i < autores.size(); i++){
            //Compara los id de los autores
            if(autores.equals(autor)){
                //En caso de encontrarlo retorna el indice
                return i;
            }
        }
        return -1; // si termino de recorrer la lista devuelve -1
    }
    /**
     * Modifica un autor especifico
     * @param autor autor a modificar
     */
    public void modificarAutor(Autor autor){
        //Se busca el indice del autor dentro del arraylist
        int indice = obtenerIndiceAutor(autor);
        if(indice < 0){
            //No se encontro el autor
            System.out.println("No se encontro el autor");
        }
        else{
            //Existe el autor y se modifica
            autores.set(indice, autor);
        }
    }
    /**
     * Remueve un autor de la lista
     * @param autor objeto autor a remover
     */
    public void borrarAutor(Autor autor){
        autores.removeIf(aut -> aut.equals(autor));
    }
    
    //Metodos accesores
    
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
}
