
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.Diagnostico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class DiagnosticoCrud {
    private List<Diagnostico> lista = new ArrayList<>();

    public void agregar(Diagnostico obj) throws Exception {
        if (obj == null) throw new Exception("Diagnóstico nulo");
        lista.add(obj);
    }

    public Diagnostico buscar(String nombreEnfermedad) throws Exception {
        for (Diagnostico d : lista) {
            if (d.getNombreEnfermedad().equalsIgnoreCase(nombreEnfermedad)) return d;
        }
        throw new Exception("Diagnóstico no encontrado");
    }

    public void editar(String nombreEnfermedad, Diagnostico nuevo) throws Exception {
        Diagnostico actual = buscar(nombreEnfermedad);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(String nombreEnfermedad) throws Exception {
        Diagnostico obj = buscar(nombreEnfermedad);
        lista.remove(obj);
    }

    public List<Diagnostico> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }
    
    
}
