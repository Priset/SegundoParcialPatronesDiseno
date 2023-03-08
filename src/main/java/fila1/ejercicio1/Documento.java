package fila1.ejercicio1;

public class Documento {
    private String nuevoCambio;
    private String state;

    public Documento(String nuevoCambio, String state) {
        this.nuevoCambio = nuevoCambio;
        this.state = state;
    }

    public String getNuevoCambio() {
        return nuevoCambio;
    }

    public void setNuevoCambio(String nuevoCambio) {
        this.nuevoCambio = nuevoCambio;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showDocumento(){
        System.out.println(getNuevoCambio());
    }
}
