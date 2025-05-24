
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class MedicoCrud {
        private List<Medico> lista = new ArrayList<>();

    public void agregar(Medico obj) throws Exception {
        if (obj == null) throw new Exception("Médico nulo");
        lista.add(obj);
    }

    public Medico buscar(String nombre) throws Exception {
        for (Medico m : lista) {
            if (m.getNombre().equalsIgnoreCase(nombre)) return m;
        }
        throw new Exception("Médico no encontrado");
    }

    public void editar(String nombre, Medico nuevo) throws Exception {
        Medico actual = buscar(nombre);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(String nombre) throws Exception {
        Medico obj = buscar(nombre);
        lista.remove(obj);
    }

    public List<Medico> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }
    
    
}
