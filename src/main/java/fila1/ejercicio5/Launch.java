package fila1.ejercicio5;

public class Launch {
    public static void main(String[] args) throws InterruptedException {
        Celular celular = new Celular();
        celular.setEstado(new Apagado());

        celular.celularResourceManager();
        celular.showCelular();

        System.out.println("**********************************************");

        celular.setEstado(new Reiniciar());
        celular.celularResourceManager();
        celular.showCelular();

        System.out.println("**********************************************");

        celular.setEstado(new Prendido());
        celular.celularResourceManager();
    }
}
