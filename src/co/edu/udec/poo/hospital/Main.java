import co.edu.udec.poo.hospital.modelo.entidades.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Erick
 */
public class Main {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Laboratorio lab = new Laboratorio("SaludVital", "Av. Siempre Viva 742", "3001234567");

        Medicamento medicamento = new Medicamento(
                "Dolorin", "Paracetamol", "Paracetamol",
                "MediPharma", "Tabletas", false, "mg",
                "500", "250", "No administrar con daño hepatico",
                true, true, 100, lab
        );

        Medico medico = new Medico(
                "Dr. Jorge Rivera", "Cra 10 #20-30", "3103344556", "Cali",
                "Valle del Cauca", "760001", "123456789Z", "900112233",
                "RIV2023", "TITULAR"
        );

        Paciente paciente = new Paciente(
                "Lucia Fernandez", "Cl 50 #15-22", "3205566778", "760002",
                "109998877", "5500112233", medico
        );

        CitaMedica cita = new CitaMedica(
                LocalDate.now(), LocalTime.of(15, 0), "Consultorio 2",
                "Nueva EPS", "Clinica Regional", medico, paciente
        );

        Diagnostico diagnostico = new Diagnostico("Gripe", "Congestion nasal, fiebre, malestar general");
        diagnostico.agregarSintoma(new Sintoma("Congestion nasal"));
        diagnostico.agregarSintoma(new Sintoma("Fiebre"));

        Receta receta = new Receta(LocalDate.now(), LocalDate.now().plusDays(5));
        MedicamentoPrescrito prescrito = new MedicamentoPrescrito(medicamento, 6, "Cada 8h");
        receta.agregarMedicamento(prescrito);
        diagnostico.asignarReceta(receta);

        cita.asignarDiagnostico(diagnostico);

        System.out.println("==== CITA REGISTRADA ====");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Medico: " + medico.getNombre());
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Diagnostico: " + diagnostico.resumen());
        System.out.println("Medicamento: " + prescrito.getMedicamento().getNombreComercial());
    } 
        
}
    
    
