
package control;
import modelo.*;
import vista.Main;
import javax.swing.*;
import java.awt.*;



import java.util.ArrayList;
import java.util.Random;





public class supervisionEmpleados {

    public static ArrayList<empleado> listaEmpleados = new ArrayList<>();
    static Random random = new Random();


    public static void verEmpleados() {
        // Verificar si la lista está vacía


        // Construir el texto con la información de los empleados
        StringBuilder sb = new StringBuilder();
        for (empleado empleado : listaEmpleados) {
            sb.append("ID: ").append(empleado.getId())
                    .append(", Labor: ").append(empleado.getLabor())
                    .append(", Tarea: ").append(empleado.getTarea())
                    .append("\n");
        }

        // Mostrar la información en un JOptionPane
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);
    }





    public static void crearEmpleado(){
        //Pendiente por revisar
        String aux;
        long auxnum;
        empleado empleadoaux = new empleado();

        aux = JOptionPane.showInputDialog(null,"Ingrese el nombre del nuevo empleado: ");
        empleadoaux.setNombre(aux);

        auxnum=Long.parseLong(JOptionPane.showInputDialog(null,"Ingrese la cédula del nuevo empleado: "));
        empleadoaux.setCedula(auxnum);

        auxnum=Long.parseLong(JOptionPane.showInputDialog(null,"Ingrese el numero de celular del nuevo empleado: "));
        empleadoaux.setNumeroCelular(auxnum);

        aux = JOptionPane.showInputDialog(null,"Ingrese la profesión del nuevo empleado: ");
        empleadoaux.setLabor(aux);
        long randomLong = 1 + (long)(random.nextDouble() * (2_000_000_000 - 1));
        empleadoaux.setId(randomLong);
        empleadoaux.setTarea(null);

        String[] Usuario = {"Crear más empleados \n", "Volver al menú\n", "SALIR"};
        int eleccion;

        do {
            // Mostrar el menú y obtener la elección del usuario
            eleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción:",
                    "Opciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    Usuario,
                    Usuario[0]);

            // Verificar la opción seleccionada
            switch (eleccion) {
                case 0:
                    crearEmpleado();
                    break;
                case 1:
                    Main.admistrarEmpleados();
                    break;
                case -1:
                    // Manejo para cerrar el diálogo sin seleccionar una opción
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona una opción válida.");
                    vista.Main.terminarPrograma(0);
                    break;
            }
        } while (eleccion < 0 || eleccion >= Usuario.length); // Repetir si la opción es inválida



    }
}
