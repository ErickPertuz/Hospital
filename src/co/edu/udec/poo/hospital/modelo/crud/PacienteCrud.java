
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class PacienteCrud {
     private List<Paciente> lista = new ArrayList<>();

    public void agregar(Paciente obj) throws Exception {
        if (obj == null) throw new Exception("Paciente nulo");
        lista.add(obj);
    }

    public Paciente buscar(String nombre) throws Exception {
        for (Paciente p : lista) {
            if (p.getNombre().equalsIgnoreCase(nombre)) return p;
        }
        throw new Exception("Paciente no encontrado");
    }

    public void editar(String nombre, Paciente nuevo) throws Exception {
        Paciente actual = buscar(nombre);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(String nombre) throws Exception {
        Paciente obj = buscar(nombre);
        lista.remove(obj);
    }

    public List<Paciente> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }
    
    
}
