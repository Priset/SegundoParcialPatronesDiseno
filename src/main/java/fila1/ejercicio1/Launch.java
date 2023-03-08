package fila1.ejercicio1;

public class Launch {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Versionador versionador = new Versionador();
        Documento documento;

        documento = new Documento("Introduccion", "Primer cambio");
        versionador.guardarCambio(documento);
        controlador.addVersion(versionador.createCambio());

        documento = new Documento("Objetivos", "Segundo cambio");
        versionador.guardarCambio(documento);
        controlador.addVersion(versionador.createCambio());

        documento = new Documento("Desarrollo", "Tercer cambio");
        versionador.guardarCambio(documento);
        controlador.addVersion(versionador.createCambio());

        documento = new Documento("Conclusion", "Cuarto cambio");
        versionador.guardarCambio(documento);
        controlador.addVersion(versionador.createCambio());

        int numCambios = 4;

        System.out.println("********OPCION CONTROL+Z********");
        documento = versionador.revertirCambio(controlador.getVersion(numCambios - 2));
        documento.showDocumento();

        documento = versionador.revertirCambio(controlador.getVersion(numCambios - 1));
        documento.showDocumento();

        documento = versionador.revertirCambio(controlador.getVersion(numCambios));
        documento.showDocumento();

        System.out.println("********OPCION CONTROL+Y********");
        documento = versionador.revertirCambio(controlador.getVersion(numCambios - 1));
        documento.showDocumento();

        documento = versionador.revertirCambio(controlador.getVersion(numCambios - 2));
        documento.showDocumento();

        documento = versionador.revertirCambio(controlador.getVersion(numCambios - 3));
        documento.showDocumento();
    }
}
