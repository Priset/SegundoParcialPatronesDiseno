package fila1.ejercicio4;

public class Libros {
    private String id;
    private String titulo;
    private String categoria;

    public Libros(String id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void showLibro(){
        System.out.println("********LIBRO***********");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("ID: "+getId());
        System.out.println("Categoria: "+getCategoria());
    }
}
