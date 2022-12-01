package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {

    public LectorArchivo() {
    }

    public List<String> leer(String ruta) throws IOException {

        List<String> datos = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;

        while ((linea = br.readLine()) != null) {

            datos.add(linea);

        }

        br.close();

        return datos;

    }

}
