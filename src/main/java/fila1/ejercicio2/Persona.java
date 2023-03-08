package fila1.ejercicio2;

public abstract class Persona {
    private String cargo;
    protected IChat chat;

    public Persona(IChat chat) {
        this.chat = chat;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void send(String msg, String tipoMensaje);
    public abstract void received(String msg);
}
