import br.com.jackson.persistence.FilePersistence;
import br.com.jackson.persistence.IOFilePersistence;
import br.com.jackson.persistence.NIO2FilePersistence;
import br.com.jackson.persistence.NIOFilePersistence;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FilePersistence persistence = new NIO2FilePersistence("user.csv");

        System.out.println("================================");
        System.out.println(persistence.write("Luana;luana@luana.com;28/09/1989;"));
        System.out.println("================================");
        System.out.println(persistence.write("Gabriela;gabriela@gabi.com;01/01/1999;"));
        System.out.println("================================");
        System.out.println(persistence.write("Luiza;luiza@luiza.com;03/05/2001;"));
        System.out.println("================================");
        System.out.println(persistence.findAll());
        System.out.println("================================");
        System.out.println(persistence.remove("gabriela@"));
        System.out.println("================================");
        System.out.println(persistence.remove("dona@"));
        System.out.println("================================");
        System.out.println(persistence.findBy(";28/09"));
        System.out.println("================================");
        System.out.println(persistence.findBy("Julia"));
        System.out.println("================================");
        System.out.println(persistence.replace(";03/05/2", "Milka;milka@milka.com;20/06/1985"));
        System.out.println("================================");
        System.out.println(persistence.replace("Julia", "Maria;maria@maria.com;09/10/1999"));
        System.out.println("================================");
        System.out.println(persistence.findAll());



    }
}
