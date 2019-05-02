/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao.imp;

import aplicacion.dao.IAutorDao;
import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.util.ListaAutores;
import java.io.Serializable;
import java.util.List;

/**
 * Implementacion de IAutorDao
 */
public class AutorDaoImp implements Serializable, IAutorDao{

    private ListaAutores listaAutores;

    public AutorDaoImp() {
        listaAutores = new ListaAutores();
    }
    
    @Override
    public void agregarAutor(Autor autor) {
        listaAutores.agregarAutor(autor);
    }

    @Override
    public void modificarAutor(Autor autor) {
        listaAutores.modificarAutor(autor);
    }

    @Override
    public void borrarAutor(Autor autor) {
        listaAutores.borrarAutor(autor);
    }

    @Override
    public List<Autor> obtenerAutores() {
        return listaAutores.getAutores();
    }
    
}
