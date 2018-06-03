/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.bean;

import films.ejb.CategoryFacade;
import films.ejb.FilmCategoryFacade;
import films.ejb.FilmFacade;
import films.entity.Category;
import films.entity.Film;
import films.entity.FilmCategory;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Fran Gambero
 */
@Named(value = "filmBean")
@RequestScoped
public class filmBean implements Serializable{

    @EJB
    private FilmCategoryFacade filmCategoryFacade;

    @EJB
    private CategoryFacade categoryFacade;

    @EJB
    private FilmFacade filmFacade;
    
    
    protected List<Film> listaPeliculas;
    protected List<Category> listaCategorias;
    protected List<FilmCategory> listaMaxima;
    protected Category categoriaSeleccionada;
    protected Short categoriaId=0;
    protected FilmCategory categoriaPelicula;
    protected Short filmIdSeleccionado =-1;
    
    /**
     * Creates a new instance of filmBean
     */
    public filmBean() {
    }

    public Short getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Short categoriaId) {
        this.categoriaId = categoriaId;
    }
    
    public List<Film> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Film> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public List<Category> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Category> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public Category getCategoriaSeleccionada() {
        return categoriaSeleccionada;
    }

    public void setCategoriaSeleccionada(Category categoriaSeleccionada) {
        this.categoriaSeleccionada = categoriaSeleccionada;
    }

    public List<FilmCategory> getListaMaxima() {
        return listaMaxima;
    }

    public void setListaMaxima(List<FilmCategory> listaMaxima) {
        this.listaMaxima = listaMaxima;
    }

    public Short getFilmIdSeleccionado() {
        return filmIdSeleccionado;
    }

    public void setFilmIdSeleccionado(Short filmIdSeleccionado) {
        this.filmIdSeleccionado = filmIdSeleccionado;
    }
    
    
    

    public String doCarga(){
       categoriaSeleccionada = categoryFacade.find(categoriaId);
       listaMaxima =  categoriaSeleccionada.getFilmCategoryList();       
       
        return "index";
    }
    
    public String doReset(){
        listaMaxima = filmCategoryFacade.findAll();
        categoriaId = 0;
        
        return "index";
    }
    
    public String doBorrar(Short filmID){
        this.filmIdSeleccionado = filmID;
        /*Film film = this.filmFacade.find(19);
        FilmCategory fm = this.filmCategoryFacade.find(19);
        if(film != null)
            this.filmFacade.remove(film);
            this.filmCategoryFacade.remove(fm);
        
        return "index"; */
        return "prueba";
    }
    
    public String doEditar(Short filmId){
        
        
        
        return "editarFilm";
    }
    
    @PostConstruct
    public void init(){
        listaPeliculas = filmFacade.findAll();
        listaCategorias = categoryFacade.findAll();
        listaMaxima = filmCategoryFacade.findAll();
        this.filmIdSeleccionado = -1;
        //categoriaSeleccionada.getFilmCategoryList().get(0).getFilm();
        //categoriaPelicula = filmCategoryFacade.find(categoriaId);
        
    }
}
