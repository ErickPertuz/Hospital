
import co.edu.udec.poo.hospital.modelo.crud.CitaMedicaCrud;
import co.edu.udec.poo.hospital.modelo.crud.DiagnosticoCrud;
import co.edu.udec.poo.hospital.modelo.crud.LaboratorioCrud;
import co.edu.udec.poo.hospital.modelo.crud.MedicamentoCrud;
import co.edu.udec.poo.hospital.modelo.crud.MedicoCrud;
import co.edu.udec.poo.hospital.modelo.crud.PacienteCrud;
import co.edu.udec.poo.hospital.modelo.crud.RecetaCrud;
import co.edu.udec.poo.hospital.modelo.entidades.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1. Gestionar Medicos");
            System.out.println("2. Gestionar Pacientes");
            System.out.println("3. Gestionar Laboratorios");
            System.out.println("4. Gestionar Medicamentos");
            System.out.println("5. Gestionar Citas Medicas");
            System.out.println("6. Gestionar Diagnosticos");
            System.out.println("7. Gestionar Recetas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 ->
                    menuMedicos(entrada);
                case 2 ->
                    menuPacientes(entrada);
                case 3 ->
                    menuLaboratorios(entrada);
                case 4 ->
                    menuMedicamentos(entrada);
                case 5 ->
                    menuCitas(entrada);
                case 6 ->
                    menuDiagnosticos(entrada);
                case 7 ->
                    menuRecetas(entrada);
                case 0 ->
                    System.out.println("Saliendo del sistema...");
                default ->
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }

    public static void pausar(Scanner entrada) {
        System.out.println("\nPresione ENTER para continuar...");
        entrada.nextLine();
    }

    public static void menuMedicos(Scanner entrada) {
        System.out.println("\n--- GESTION DE MEDICOS ---");
        MedicoCrud medicoCrud = new MedicoCrud();
        try {
            Medico m1 = new Medico("Dr. Jorge Rivera", "Cra 10 #20-30", "3103344556", "Cali", "Valle del Cauca", "760001", "123456789Z", "900112233", "RIV2023", "TITULAR");
            medicoCrud.agregar(m1);

            Medico m2 = new Medico("Dra. Ana Rios", "Cl 15 #30-12", "3119876543", "Bogota", "Cundinamarca", "110111", "987654321A", "901122334", "ANA2023", "INTERINA");
            medicoCrud.agregar(m2);

            Medico encontrado = medicoCrud.buscar("Dra. Ana Rios");
            encontrado.setCategoria("PLANTA");
            medicoCrud.editar("Dra. Ana Rios", encontrado);
            medicoCrud.eliminar("Dr. Jorge Rivera");
            System.out.println("Lista de medicos:");
            medicoCrud.listarTodo().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error en Medicos: " + e.getMessage());
        }
        pausar(entrada);
    }

    public static void menuPacientes(Scanner entrada) {
        System.out.println("\n--- GESTION DE PACIENTES ---");
        PacienteCrud pacienteCrud = new PacienteCrud();
        try {
            Medico m2 = new Medico("Dra. Ana Rios", "Cl 15 #30-12", "3119876543", "Bogota", "Cundinamarca", "110111", "987654321A", "901122334", "ANA2023", "INTERINA");
            Paciente p1 = new Paciente("Lucia Fernandez", "Cl 50 #15-22", "3205566778", "760002", "109998877", "5500112233", m2);
            pacienteCrud.agregar(p1);

            Paciente p2 = new Paciente("Carlos Martinez", "Cl 60 #10-10", "3213344556", "760003", "109887766", "6600112233", m2);
            pacienteCrud.agregar(p2);

            Paciente pEncontrado = pacienteCrud.buscar("Carlos Martinez");
            pEncontrado.setTelefono("3007778888");
            pacienteCrud.editar("Carlos Martinez", pEncontrado);
            pacienteCrud.eliminar("Lucia Fernandez");
            System.out.println("Lista de pacientes:");
            pacienteCrud.listarTodo().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error en Pacientes: " + e.getMessage());
        }
        pausar(entrada);
    }

    public static void menuLaboratorios(Scanner entrada) {
        System.out.println("\n--- GESTION DE LABORATORIOS ---");
        LaboratorioCrud labCrud = new LaboratorioCrud();
        try {
            Laboratorio lab1 = new Laboratorio("Biogen", "Cl 90 #11-50", "3210001111");
            labCrud.agregar(lab1);

            Laboratorio lab2 = new Laboratorio("PharmaCol", "Av 30 #25-10", "3118889999");
            labCrud.agregar(lab2);

            labCrud.editar("Biogen", new Laboratorio("Biogen", "Cl 90 #11-50", "3000000000"));
            labCrud.eliminar("PharmaCol");
            System.out.println("Lista de laboratorios:");
            labCrud.listarTodo().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error en Laboratorios: " + e.getMessage());
        }
        pausar(entrada);
    }

    public static void menuMedicamentos(Scanner entrada) {
        System.out.println("\n--- GESTION DE MEDICAMENTOS ---");
        MedicamentoCrud medCrud = new MedicamentoCrud();
        try {
            Laboratorio lab = new Laboratorio("Biogen", "Cl 90 #11-50", "3210001111");
            Medicamento med1 = new Medicamento("Dolorin", "Paracetamol", "Paracetamol", "MediPharma", "Tabletas", false, "mg", "500", "250", "No usar con alcohol", true, true, 100, lab);
            medCrud.agregar(med1);

            Medicamento med2 = new Medicamento("Antiflu", "Ibuprofeno", "Ibuprofeno", "Biogen", "Capsulas", false, "mg", "400", "200", "No recomendado en embarazo", true, false, 80, lab);
            medCrud.agregar(med2);

            medCrud.editar("Antiflu", new Medicamento("Antiflu", "Ibuprofeno", "Ibuprofeno", "Biogen", "Capsulas", false, "mg", "600", "200", "No recomendado en embarazo", true, false, 80, lab));
            medCrud.eliminar("Dolorin");
            System.out.println("Lista de medicamentos:");
            medCrud.listarTodo().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error en Medicamentos: " + e.getMessage());
        }
        pausar(entrada);
    }

    public static void menuCitas(Scanner entrada) {
        System.out.println("\n--- GESTION DE CITAS MEDICAS ---");
        CitaMedicaCrud citaCrud = new CitaMedicaCrud();
        try {
            Medico m = new Medico("Dra. Ana Rios", "Cl 15 #30-12", "3119876543", "Bogota", "Cundinamarca", "110111", "987654321A", "901122334", "ANA2023", "INTERINA");
            Paciente p = new Paciente("Carlos Martinez", "Cl 60 #10-10", "3213344556", "760003", "109887766", "6600112233", m);
            CitaMedica cita1 = new CitaMedica(
                    LocalDate.now(), LocalTime.of(9, 0), "Consultorio 1", "Sura", "Clinica Norte", m, p);

            citaCrud.agregar(cita1);

            CitaMedica cita2 = new CitaMedica(
                    LocalDate.now().plusDays(1), LocalTime.of(10, 0), "Consultorio 2", "Nueva EPS", "Clinica Sur", m, p);
            citaCrud.agregar(cita2);

            cita2.setHora(LocalTime.of(11, 0));
            citaCrud.editar("Consultorio 2", cita2);
            citaCrud.eliminar("Consultorio 1");
            System.out.println("Lista de citas:");
            citaCrud.listarTodo().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error en Citas: " + e.getMessage());
        }
        pausar(entrada);
    }

    public static void menuDiagnosticos(Scanner entrada) {
        System.out.println("\n--- GESTION DE DIAGNOSTICOS ---");
        DiagnosticoCrud diagCrud = new DiagnosticoCrud();
        try {
            Diagnostico d1 = new Diagnostico("Gripe", "Fiebre y tos");
            diagCrud.agregar(d1);

            Diagnostico d2 = new Diagnostico("Faringitis", "Dolor de garganta intenso");
            diagCrud.agregar(d2);

            d2.setDescripcion("Dolor de garganta agudo y fiebre");
            diagCrud.editar("Faringitis", d2);
            diagCrud.eliminar("Gripe");
            System.out.println("Lista de diagnosticos:");
            diagCrud.listarTodo().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error en Diagnosticos: " + e.getMessage());
        }
        pausar(entrada);
    }

    public static void menuRecetas(Scanner entrada) {
        System.out.println("\n--- GESTION DE RECETAS ---");
        RecetaCrud recetaCrud = new RecetaCrud();

        try {
            Medico m2 = new Medico("Dra. Ana Rios", "Cl 15 #30-12", "3119876543", "Bogota", "Cundinamarca", "110111", "987654321A", "901122334", "ANA2023", "INTERINA");

            Paciente p1 = new Paciente("Lucia Fernandez", "Cl 50 #15-22", "3205566778", "760002", "109998877", "5500112233", m2);
            Paciente p2 = new Paciente("Carlos Martinez", "Cl 60 #10-10", "3213344556", "760003", "109887766", "6600112233", m2);

            Receta r1 = new Receta(LocalDate.now(), LocalDate.now().plusDays(5), p1);
            r1.setMedico(m2);
            Receta r2 = new Receta(LocalDate.now().plusDays(1), LocalDate.now().plusDays(6), p2);
            r2.setMedico(m2);

            recetaCrud.agregar(r1);
            recetaCrud.agregar(r2);

            r2.setFechaFin(LocalDate.now().plusDays(10));
            recetaCrud.editar(p2.getNombre(), r2);
            recetaCrud.eliminar(p1.getNombre());

            System.out.println("Lista de recetas:");
            for (Receta receta : recetaCrud.listarTodo()) {
                System.out.println(receta);
            }

        } catch (Exception e) {
            System.out.println("Error en Recetas: " + e.getMessage());
        }

        pausar(entrada);
    }

}
