import br.com.jackson.persistence.FilePersistence;
import br.com.jackson.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("============================");
        System.out.println(persistence.write("Jackson;jackson@jackson.com;24/10/2004;"));
        System.out.println("============================");
        System.out.println(persistence.write("Maria;maria@jackson.com;20/10/2003;"));
        System.out.println("============================");
        System.out.println(persistence.write("lucas;lucas@lucas.com;14/03/1994;"));
        System.out.println("============================");
        System.out.println(persistence.findAll());
        System.out.println("============================");
        System.out.println(persistence.remove("14/03/1994"));
        System.out.println("============================");
        System.out.println(persistence.remove("/09/84"));
        System.out.println(persistence.findBy("Jackson;"));
        System.out.println("============================");
        System.out.println(persistence.findBy(";maria@"));
        System.out.println("============================");
        System.out.println(persistence.findBy("94;"));
        System.out.println("============================");
        System.out.println(persistence.replace(".com;24/10/", "Lara;lara@lara.com;/22/02/1990;"));
        System.out.println("============================");
        System.out.println(persistence.findAll());

    }
}
