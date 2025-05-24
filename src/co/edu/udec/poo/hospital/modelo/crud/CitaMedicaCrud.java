
package co.edu.udec.poo.hospital.modelo.crud;

import co.edu.udec.poo.hospital.modelo.entidades.CitaMedica;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class CitaMedicaCrud {
    private List<CitaMedica> lista = new ArrayList<>();

    public void agregar(CitaMedica obj) throws Exception {
        if (obj == null) throw new Exception("Cita médica nula");
        lista.add(obj);
    }

    public CitaMedica buscar(LocalTime hora, Object horaLocalTime) throws Exception {
    for (CitaMedica c : lista) {
        if (c.getHora().equals(horaLocalTime)) {
            return c;
        }
    }
    throw new Exception("Cita no encontrada");
}

    public void editar(LocalTime hora, CitaMedica nuevo) throws Exception {
        CitaMedica actual = buscar(hora);
        lista.set(lista.indexOf(actual), nuevo);
    }

    public void eliminar(LocalTime hora) throws Exception {
        CitaMedica obj = buscar(hora);
        lista.remove(obj);
    }

    public List<CitaMedica> listarTodo() {
        return lista;
    }

    public int contar() {
        return lista.size();
    }

    private CitaMedica buscar(LocalTime hora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static class horaLocalTime {

        public horaLocalTime() {
        }
    }
    
    
}
