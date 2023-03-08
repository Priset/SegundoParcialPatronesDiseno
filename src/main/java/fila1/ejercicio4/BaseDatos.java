package fila1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

    private List<Libros> librosList = new ArrayList<>();
    private IOrden orden;

    public List<Libros> getLibrosList() {
        return librosList;
    }

    public void setLibrosList(List<Libros> librosList) {
        this.librosList = librosList;
    }

    public IOrden getOrden() {
        return orden;
    }

    public void setOrden(IOrden orden) {
        this.orden = orden;
    }

    public BaseDatos(IOrden orden){
        this.orden= orden;
    }

    public void addLibros(Libros libros){
        librosList.add(libros);
    }

    public void ordenarListaLibros(){
        orden.ordenar(librosList);
    }
}
