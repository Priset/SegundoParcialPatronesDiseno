package fila1.ejercicio4;

import java.util.Comparator;
import java.util.List;

public class OrdenCategoria implements IOrden{
    @Override
    public void ordenar(List<Libros> librosList) {
        librosList.sort(Comparator.comparing(Libros::getCategoria));
        for(Libros libro : librosList){
            libro.showLibro();
        }
    }
}
