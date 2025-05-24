
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.Receta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class RecetaCrud {
    private List<Receta> lista = new ArrayList<>();

    public void agregar(Receta obj) throws Exception {
        if (obj == null) throw new Exception("Receta nula");
        lista.add(obj);
    }

    public Receta buscar(String nombrePaciente) throws Exception {
        for (Receta r : lista) {
            if (r.getPaciente().getNombre().equalsIgnoreCase(nombrePaciente)) return r;
        }
        throw new Exception("Receta no encontrada");
    }

    public void editar(String nombrePaciente, Receta nuevo) throws Exception {
        Receta actual = buscar(nombrePaciente);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(String nombrePaciente) throws Exception {
        Receta obj = buscar(nombrePaciente);
        lista.remove(obj);
    }

    public List<Receta> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }
    
    
}
