package fila1.ejercicio3;

public class Usuario implements IUsuario{
    private String tipoNotificacion;
    private String nombre;

    public Usuario(String tipoNotificacion, String nombre) {
        this.tipoNotificacion = tipoNotificacion;
        this.nombre = nombre;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("EL usuario: "+getNombre()+ " recibe notificación de: "+getTipoNotificacion()+"\n"+msg);
        System.out.println("**************************************");
    }
}
