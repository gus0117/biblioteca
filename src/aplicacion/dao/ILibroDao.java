/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Rocio
 */
public interface ILibroDao {
    public abstract void guardarLibro(Libro libro);
    public abstract void modificarLibro(Libro libro);
    public abstract void borrarLibro(Libro libro);
}
