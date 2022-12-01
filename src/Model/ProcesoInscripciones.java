package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProcesoInscripciones {

    private LectorArchivo lector;
    private HashMap<String, Estudiante> estudiantes;

    public ProcesoInscripciones() {
        this.lector = new LectorArchivo();
        this.estudiantes = new HashMap<>();
    }

    public List<String> procesarArchivo(String ruta) throws IOException {

        lector = new LectorArchivo();
        List<String> reporte = new ArrayList<>();
        List<String> datos = lector.leer(ruta);

        for (String dato : datos) {
            this.procesarLinea(dato);

        }
        for (Estudiante estudiante : estudiantes.values()) {
            String nombre = estudiante.getNombre();
            int materias = estudiante.getCodigosMaterias().size();

            reporte.add("Nombre estudiante: " + nombre + " -- " + Integer.toString(materias));
        }

        return reporte;

    }

    private void procesarLinea(String linea) {
        String[] arreglo;

        if ((linea != null)) {
            arreglo = linea.split(",");
            Estudiante estudiante = buscarEstudiante(arreglo[0]);

            if (arreglo.length == 4) {
                if (estudiante == null) {
                    Estudiante estudiante2 = new Estudiante(arreglo[0], arreglo[1]);
                    this.estudiantes.put(arreglo[0], estudiante2);
                    estudiante2.adicionarMateria(arreglo[2]);
                } else {
                    estudiante.adicionarMateria(arreglo[2]);
                }
            }
            return;
        }

    }

    private Estudiante buscarEstudiante(String cedula) {

        Estudiante estudiante1 = null;

        for (Estudiante estudiante : estudiantes.values()) {
            if (estudiante.getCedula().equals(cedula)) {
                estudiante1 = estudiante;
            }
        }
        return estudiante1;

    }

}
