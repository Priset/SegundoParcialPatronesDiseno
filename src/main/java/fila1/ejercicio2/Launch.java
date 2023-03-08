package fila1.ejercicio2;

public class Launch {
    public static void main(String[] args) {
        ConcreteChat chat = new ConcreteChat();

        Estudiante est1 =new Estudiante(chat);
        est1.setCargo("estudiante");
        est1.setNombre("Brandon");

        Estudiante est2 =new Estudiante(chat);
        est2.setCargo("estudiante");
        est2.setNombre("Jose");

        Docente doc1 = new Docente(chat);
        doc1.setCargo("docente");
        doc1.setNombre("Walter");

        Docente doc2 = new Docente(chat);
        doc2.setCargo("docente");
        doc2.setNombre("Jhon");

        Administrativo admin1 = new Administrativo(chat);
        admin1.setCargo("administrativo");
        admin1.setNombre("Soriaqueton");

        Administrativo admin2 = new Administrativo(chat);
        admin2.setCargo("administrativo");
        admin2.setNombre("Marcelo");

        chat.addToChat(est1);
        chat.addToChat(est2);
        chat.addToChat(doc1);
        chat.addToChat(doc2);
        chat.addToChat(admin1);
        chat.addToChat(admin2);


        System.out.println("***********ADMINS*************");
        est2.send("Buenas admins", "administrativo");
        System.out.println("***********ESTDS*************");
        doc2.send("Buenas jovenes", "estudiante");
        System.out.println("***********GLOBAL*************");
        admin1.send("BUENAS!", "grupal");
    }
}
