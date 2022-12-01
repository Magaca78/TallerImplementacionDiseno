package Model;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {

    private String cedula, nombre;
    private Set<String> codigosMaterias;

    public Estudiante(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigosMaterias = new HashSet<>();
    }

    public boolean adicionarMateria(String codigoMateria){
        
        return this.codigosMaterias.add(codigoMateria);
            
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getCodigosMaterias() {
        return codigosMaterias;
    }

   

   

}
