package fila1.ejercicio3;

public class Launch {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.suscribir(new Usuario("video","Lua"));
        facebook.suscribir(new Usuario("video","Nala"));
        facebook.suscribir(new Usuario("video","Mili"));
        facebook.suscribir(new Usuario("imagen","Tommy"));
        facebook.suscribir(new Usuario("imagen","Bruno"));

        facebook.sendNotificacion("video", "Nueva actualizacion de forest aca");
        facebook.sendNotificacion("imagen","Lelepons subio nueva foto");
    }
}
