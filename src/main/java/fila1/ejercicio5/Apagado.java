package fila1.ejercicio5;

import java.util.Arrays;

public class Apagado implements IEstado{
    @Override
    public void setStateCelular(Celular celular)  {

        System.out.println("********APAGANDO************");

        celular.setConsumoRam(0);
        celular.setConsumoCpu(0);
        Arrays.fill(celular.getProgramasAbiertos(), "Cerrado");
    }
}
