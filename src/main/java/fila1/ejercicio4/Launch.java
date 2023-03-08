package fila1.ejercicio4;

public class Launch {
    public static void main(String[] args) {
        BaseDatos baseDatos = new BaseDatos(new OrdenTitulo());

        Libros lb1 = new Libros("4D4F97SDF","Lord Of The Rings","Fantasia");
        Libros lb2 = new Libros("156198FSD","Del amor y otros demonios","Drama");
        Libros lb3 = new Libros("9889SDFF","Narnia","Fantasia");
        Libros lb4 = new Libros("031234SDF","IT","Suspenso");
        Libros lb5 = new Libros("2898SDFDS","Stranger things","Cienciaficcion");

        baseDatos.addLibros(lb1);
        baseDatos.addLibros(lb2);
        baseDatos.addLibros(lb3);
        baseDatos.addLibros(lb4);
        baseDatos.addLibros(lb5);

        System.out.println("***********ORDEN POR TITULO************");
        baseDatos.ordenarListaLibros();

        baseDatos.setOrden(new OrdenId());
        System.out.println("***********ORDEN POR ID************");
        baseDatos.ordenarListaLibros();

        baseDatos.setOrden(new OrdenCategoria());
        System.out.println("***********ORDEN POR CATEGORIA************");
        baseDatos.ordenarListaLibros();
    }
}
