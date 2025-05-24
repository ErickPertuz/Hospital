
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.Medicamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class MedicamentoCrud {
     private List<Medicamento> lista = new ArrayList<>();

    public void agregar(Medicamento obj) throws Exception {
        if (obj == null) throw new Exception("Medicamento nulo");
        lista.add(obj);
    }

    public Medicamento buscar(String nombreComercial) throws Exception {
        for (Medicamento m : lista) {
            if (m.getNombreComercial().equalsIgnoreCase(nombreComercial)) return m;
        }
        throw new Exception("Medicamento no encontrado");
    }

    public void editar(String nombreComercial, Medicamento nuevo) throws Exception {
        Medicamento actual = buscar(nombreComercial);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(String nombreComercial) throws Exception {
        Medicamento obj = buscar(nombreComercial);
        lista.remove(obj);
    }

    public List<Medicamento> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }
    
    
    
    
    
}
