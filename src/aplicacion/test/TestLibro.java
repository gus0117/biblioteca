/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IAutorDao;
import aplicacion.dao.ILibroDao;
import aplicacion.dao.imp.AutorDaoImp;
import aplicacion.dao.imp.LibroDaoImp;
import aplicacion.modelo.dominio.Libro;
import java.util.Calendar;
import java.util.Date;


public class TestLibro {
    public static void main(String[] args){
        //Instancia de objetos
        ILibroDao testLibro = new LibroDaoImp();
        Calendar fecha = Calendar.getInstance();
        Date fechaDate = fecha.getTime();
        fecha.set(1980, 5, 13);
        //Generar Autores
        IAutorDao autorDao = new AutorDaoImp();
        Libro libro1 = new Libro(10, 1, "BBBBB", 200, autorDao.obtenerAutores(), "Terror", fechaDate);
        Libro libro2 = new Libro(20, 2, "ACCCC", 400, autorDao.obtenerAutores(), "Drama", fechaDate);
        Libro libro3 = new Libro(30, 3, "AAAa", 120, autorDao.obtenerAutores(), "Fantastico", fechaDate);
        
        
        //Guardando libros
        testLibro.guardarLibro(libro1);
        testLibro.guardarLibro(libro2);
        testLibro.guardarLibro(libro3);
        
        //Modificar libro3
        libro3.setTitulo("Libro4");
        testLibro.modificarLibro(libro3);
        
        //Borrar libro1
        testLibro.borrarLibro(libro1);
        
        //Ordenar Lista por Nombre
        testLibro.ordenarListaLibros(true);

        //Mostrar Lista completa
        System.out.println("Mostrar Lista Completa");
        testLibro.mostrarLista();
        System.out.println("-----------------------");
        //Mostrar Lista de libros que empiezan con un caracter
        char letra = 'A';
        System.out.println("Mostrar Libros que empiezan con " + letra);
        testLibro.mostrarListaSegunNombre(letra);
        
    }
}
