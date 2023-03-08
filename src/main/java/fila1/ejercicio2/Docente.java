package fila1.ejercicio2;

public class Docente extends Persona{
    private String nombre;
    public Docente(IChat chat) {
        super(chat);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        chat.send(msg, tipoMensaje, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Mensaje recibido por: "+getNombre()+": \n"+msg);
    }
}
