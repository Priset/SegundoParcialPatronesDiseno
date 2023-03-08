package fila1.ejercicio1;

public class Memento {
    private Documento state;
    public Memento(Documento concreteObject){
        state=concreteObject;
    }

    public Documento getState(){
        return state;
    }
}
