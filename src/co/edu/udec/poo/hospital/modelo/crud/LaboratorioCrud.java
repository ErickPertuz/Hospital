
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.Laboratorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class LaboratorioCrud {
    private List<Laboratorio> lista = new ArrayList<>();

    public void agregar(Laboratorio obj) throws Exception {
        if (obj == null) throw new Exception("Laboratorio nulo");
        lista.add(obj);
    }

    public Laboratorio buscar(String nombre) throws Exception {
        for (Laboratorio l : lista) {
            if (l.getNombre().equalsIgnoreCase(nombre)) return l;
        }
        throw new Exception("Laboratorio no encontrado");
    }

    public void editar(String nombre, Laboratorio nuevo) throws Exception {
        Laboratorio actual = buscar(nombre);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(String nombre) throws Exception {
        Laboratorio obj = buscar(nombre);
        lista.remove(obj);
    }

    public List<Laboratorio> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }
    
    
}
