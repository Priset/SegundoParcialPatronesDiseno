package fila1.ejercicio5;

public class Celular {
    public String[] programasAbiertos;
    private int consumoRam;
    private int consumoCpu;

    private IEstado estado;

    public Celular() {
        programasAbiertos = new String[10];
        consumoRam = 50;
        consumoCpu = 50;
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoRam() {
        return consumoRam;
    }

    public void setConsumoRam(int consumoRam) {
        this.consumoRam = consumoRam;
    }

    public int getConsumoCpu() {
        return consumoCpu;
    }

    public void setConsumoCpu(int consumoCpu) {
        this.consumoCpu = consumoCpu;
    }

    public IEstado getEstado() {
        return estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void celularResourceManager() throws InterruptedException{
        estado.setStateCelular(this);
    }

    public void showCelular(){
        System.out.println("******CELULAR********");
        System.out.println("Programas abiertos: ");

        for (String programa : programasAbiertos){
            System.out.println(programa + ", ");
        }

        System.out.println("Consumo RAM: "+getConsumoRam());
        System.out.println("Consumo CPU: "+getConsumoCpu());
    }
}
