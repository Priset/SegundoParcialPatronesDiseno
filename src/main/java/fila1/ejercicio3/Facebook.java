package fila1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook{
    private List<Usuario> usuarios = new ArrayList<>();
     public Facebook(){
     }

     public void sendNotificacion(String tipo, String msg){
         this.notificarUsuarios(msg, tipo);
     }
    @Override
    public void suscribir(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
         usuarios.remove(usuario);
    }

    @Override
    public void notificarUsuarios(String msg, String tipo) {
         if(tipo.equals("video")){
             for (Usuario user: usuarios){
                 if (user.getTipoNotificacion().equals("video")){
                     user.update(msg);
                 }
             }
         } else if (tipo.equals("imagen")) {
             for (Usuario user: usuarios){
                 if (user.getTipoNotificacion().equals("imagen")){
                     user.update(msg);
                 }
             }
         }
    }
}
