package fila1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Memento> stateList = new ArrayList<>();

    public void addVersion(Memento memento){
        stateList.add(memento);
    }

    public Memento getVersion(int numCambios){
        return stateList.get(stateList.size() - numCambios);
    }
}
