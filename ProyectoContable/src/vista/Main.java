package vista;
import control.*;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


public class Main {
    public static void main(String[] args) {
        menuUsuario();
        }


    public static void menuUsuario(){
        String[] Usuario = {"ADMIN \n", "EMPLEADO \n", "SALIR"};
        int eleccion;

        do {
            // Mostrar el menú y obtener la elección del usuario
            eleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción:",
                    "Menú Usuario",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    Usuario,
                    Usuario[0]);

            // Verificar la opción seleccionada
            switch (eleccion) {
                case 0:
                    menuAdmin();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Opción 2");
                    break;
                case 2:
                    terminarPrograma(0);
                    break;
                case -1:
                    // Manejo para cerrar el diálogo sin seleccionar una opción
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona una opción válida.");
                    break;
            }
        } while (eleccion < 0 || eleccion >= Usuario.length); // Repetir si la opción es inválida

    }




    public static void menuAdmin(){
        String[] opciones = {"Empleados", "Opción 2", "Opción 3", "Opción 4", "SALIR"};
        int eleccion2;

        do {
            // Mostrar el menú y obtener la elección del usuario
            eleccion2 = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción:",
                    "Menú Admin",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            // Verificar la opción seleccionada
            switch (eleccion2) {
                case 0:
                    admistrarEmpleados();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Opción 2");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Opción 3");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Opción 4");
                    break;
                case 4:
                    terminarPrograma(0);
                    break;
                case -1:
                    // Manejo para cerrar el diálogo sin seleccionar una opción
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona una opción válida.");
                    break;
            }
        } while (eleccion2 < 0 || eleccion2 >= opciones.length); // Repetir si la opción es inválida

    }
    public static void admistrarEmpleados(){


            String[] opciones = {"Ver empleados", "Modificar empleados", "Agregar empleados", "Buscar empleados","Eliminar empleados","Volver al menu administrador", "SALIR"};

            // Crear un JComboBox con las opciones
            JComboBox<String> comboBox = new JComboBox<>(opciones);

            int eleccion2;

            do {
                // Mostrar el diálogo con el JComboBox
                eleccion2 = JOptionPane.showOptionDialog(null,
                        comboBox,
                        "Seleccione una opción",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        null,
                        null);

                // Verificar si se seleccionó una opción válida
                if (eleccion2 == -1) {
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona una opción válida.");
                } else {
                    String opcionSeleccionada = (String) comboBox.getSelectedItem();

                    // Manejar la selección
                    switch (opcionSeleccionada) {
                        case "Ver empleados":
                            control.supervisionEmpleados.verEmpleados();
                            break;
                        case "Modificar empleados":
                            JOptionPane.showMessageDialog(null, "Has seleccionado Opción 2.");
                            break;
                        case "Agregar empleados":
                            control.supervisionEmpleados.crearEmpleado();
                            break;
                        case "Buscar empleados":
                            JOptionPane.showMessageDialog(null, "Has seleccionado Opción 4.");
                            break;
                        case "Eliminar empleados":
                            JOptionPane.showMessageDialog(null, "Has seleccionado Opción 5.");
                            break;
                        case "Volver al menu administrador":
                            menuAdmin();
                            break;
                        case "SALIR":
                            JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                            terminarPrograma(0);
                            break;
                    }
                }
            } while (eleccion2 != -1 && !comboBox.getSelectedItem().equals("SALIR")); // Repetir hasta seleccionar SALIR
        }










    public static void terminarPrograma(int status) {
        System.out.println("Terminando el programa con estado: " + status);
        System.exit(status);
    }
}


