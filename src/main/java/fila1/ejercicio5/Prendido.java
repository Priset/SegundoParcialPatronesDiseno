package fila1.ejercicio5;

import java.util.Random;

public class Prendido implements IEstado{
    @Override
    public void setStateCelular(Celular celular) throws InterruptedException {
        int programasAbiertos = new Random().nextInt(10);

        for (int i = 0; i< programasAbiertos; i++){
            celular.getProgramasAbiertos()[i] = "Programa " + (i+1);
        }

        System.out.println("Se abrieron: " + programasAbiertos+ " programas");
        System.out.println("Los recursos aumentan un: "+5*programasAbiertos+"% ");

        while (celular.getConsumoCpu()<5*programasAbiertos && celular.getConsumoRam()<5*programasAbiertos){

            celular.setConsumoCpu(celular.getConsumoCpu()+ 5);
            celular.setConsumoRam(celular.getConsumoRam()+ 5);

            celular.showCelular();

            Thread.sleep(2000);
        }
    }
}
