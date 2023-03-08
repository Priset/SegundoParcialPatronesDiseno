package fila1.ejercicio3;

public interface IFacebook {
    void suscribir(Usuario usuario);
    void borrar(Usuario usuario);
    void notificarUsuarios(String msg, String tipo);
}
