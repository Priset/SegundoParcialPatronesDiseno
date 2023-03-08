package fila1.ejercicio2;

public class Estudiante extends Persona{
    private String nombre;
    private String ci;

    public Estudiante(IChat chat) {
        super(chat);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
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
