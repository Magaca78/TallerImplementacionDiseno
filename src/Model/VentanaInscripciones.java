package Model;

import java.io.IOException;

public class VentanaInscripciones {

    public static void main(String[] args) {

        ProcesoInscripciones control = new ProcesoInscripciones();

        try {
            for (String dato : control.procesarArchivo("src/datos.txt")) {
                System.out.println(dato);

            }

        } catch (IOException e) {
            System.out.println("Ruta no existente");

        }

    }

}
