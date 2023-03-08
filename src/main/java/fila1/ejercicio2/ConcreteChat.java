package fila1.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements IChat{
    private List<Persona> chatList = new ArrayList<>();

    public void addToChat(Persona persona){
        chatList.add(persona);
    }

    @Override
    public void send(String msg, String tipoMensaje, Persona persona) {
        if(tipoMensaje.equals("grupal") && persona.getCargo().equals("estudiante")){
            for(Persona colega:chatList) {
                colega.received(msg);
            }
        } else if (tipoMensaje.equals("docente") && persona.getCargo().equals("estudiante")){
            for(Persona colega:chatList) {
                if (colega.getCargo().equals("docente")){
                    colega.received(msg);
                }
            }
        } else if (tipoMensaje.equals("administrativo") && persona.getCargo().equals("estudiante")) {
            for (Persona colega:chatList){
                if (colega.getCargo().equals("administrativo")){
                    colega.received(msg);
                }
            }
        } else if (tipoMensaje.equals("docente") && persona.getCargo().equals("docente")) {
            for (Persona colega:chatList){
                if (colega.getCargo().equals("docente") || persona.getCargo().equals("estudiante")){
                    colega.received(msg);
                }
            }
        } else if (tipoMensaje.equals("estudiante") && persona.getCargo().equals("docente")) {
            for (Persona colega:chatList){
                if (colega.getCargo().equals("estudiante")){
                    colega.received(msg);
                }
            }
        } else if (tipoMensaje.equals("grupal") && persona.getCargo().equals("administrativo")){
            for (Persona colega:chatList){
                colega.received(msg);
            }
        }
    }
}


