/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import javax.swing.JOptionPane;

//Librerias
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Menu Principal
        int opcionMenu = 0;

        while (opcionMenu != 5) {
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Digite la clase que desea probar:\n" +
                    "1. Biblioteca\n" +
                    "2. Empleado\n" +
                    "3. Usuario\n" +
                    "4. Libro\n" +
                    "5. Salir"));

            //Biblioteca
            if (opcionMenu == 1) {

                //Codigo de clase y objeto Biblioteca
                String sede = JOptionPane.showInputDialog(null,
                        "Ingrese la sede de la Biblioteca: ");
                String numerotelefonico = JOptionPane.showInputDialog
        (null,"Ingrese el numero telefonico de la "
                + "Biblioteca: ");
                String horario = JOptionPane.showInputDialog(null,
                        "Ingrese el horario de la Biblioteca: ");
                String IDbiblioteca = JOptionPane.showInputDialog
        (null,
                        "Ingrese el ID de la Biblioteca: ");
                String inventariolibros = JOptionPane.showInputDialog(
                        null,"Ingrese los libros que hay "
                                + "en la Biblioteca: ");
                
                String historial = JOptionPane.showInputDialog(null,
                        "Digite si ha ingresado a la Biblioteca"
                                + " anteriormente: ");
                biblioteca mybiblioteca = new biblioteca(sede, numerotelefonico,
                         horario, IDbiblioteca, inventariolibros, historial);
                
                JOptionPane.showMessageDialog(null,"Sede: "
                        + mybiblioteca.getSede()+ "\n" + "Numero Telefonico: "
                        + mybiblioteca.getNumerotelefonico()+ "\n" + "Horario: "
                        + mybiblioteca.getHorario()+ "\n" + "ID: "
                        + mybiblioteca.getIDBiblioteca()+ "\n" + "Inventario: "
                        + mybiblioteca.getInventarioLibros()+ "\n" + "Historial: "
                        + mybiblioteca.getHistorial());

            //Empleado
            } else if (opcionMenu == 2) {
                //Codigo de clase y objeto Empleado
                //Solicitud de Datos al empleado:
                JOptionPane.showMessageDialog(null,"Para ingresar "
                        + "bajo el perfil de empleado, complete la siguiente "
                        + "información");
                String Nombre = JOptionPane.showInputDialog("Ingrese "
                        + "su nombre:");
                String Apellido = JOptionPane.showInputDialog("Ingrese "
                        + "su apellido:");
                String IDempleado = JOptionPane.showInputDialog("Ingrese "
                        + "su IDempleado:");
                String cedula = JOptionPane.showInputDialog("Ingrese "
                        + "su cedula:");
                String correo = JOptionPane.showInputDialog("Ingrese "
                        + "su correo:");
                String telefono = JOptionPane.showInputDialog("Ingrese "
                        + "su telefono:");               
                
                
                //Creación del objeto Empleado:
                empleado MyEmpleado = new empleado(Nombre,Apellido,IDempleado,
                        cedula, correo,telefono);
                                //Confirmación de login:
                JOptionPane.showMessageDialog(null,"Bienvenid@"
                        +MyEmpleado.getNombre()+ MyEmpleado.getApellido() + 
                        "\n ID:" + MyEmpleado.getIDempleado()+
                        "ah ingresado correctamente.");

                //Menú empleado:
                int opcionEmpleado = 0;
                
                while (opcionEmpleado !=4){
                opcionEmpleado = Integer.parseInt(JOptionPane.showInputDialog(
                        "Menu de Empleado\n"
                        + "1. Nuevo Prestamo\n"
                        + "2. Añadir Libro\n"
                        + "3. Ver inventario\n"
                        + "4. Salir." ));
                    if (opcionEmpleado == 1){
                        MyEmpleado.NuevoPrestamo();
                    } else if(opcionEmpleado == 2){
                        MyEmpleado.AñadirLibro();
                    } else if (opcionEmpleado == 3) {
                        MyEmpleado.VerInventario();
                    } else if (opcionEmpleado == 4){
                    JOptionPane.showMessageDialog(null, 
                            "Usted esta saliendo del sisitema");
                    }else {
                    JOptionPane.showMessageDialog(null, 
                            "Opción inválida, intente de nuevo");
                    }
                }
          
            //Usuario
            } else if (opcionMenu == 3) {
                
                //Codigo de clase y objeto Usuario
                JOptionPane.showMessageDialog(null, "Para ingresar al menu de"
                        + " usuario, por favor cree una nueva cuenta");

                //Obtener parametros para crear usuario
                String nombre = JOptionPane.showInputDialog("Ingrese su "
                        + "nombre:");
                String apellido = JOptionPane.showInputDialog("Ingrese su "
                        + "apellido:");
                int userID = (int) Math.round(Math.random() * 10000);
                String usuario = JOptionPane.showInputDialog("Ingrese su "
                        + "nombre usuario:");
                String password = JOptionPane.showInputDialog("Ingrese su "
                        + "contraseña:");
                
                //Crear objeto usuario
                usuario MyUsuario = new usuario(nombre, apellido, userID, 
                        usuario, password);
                
                //Confirmacion de creacion de usuario
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito\n"
                        + "Nombre: " + MyUsuario.getNombre() + "\n" +
                        "Apellido: " + MyUsuario.getApellido() + "\n" +
                        "ID: " + MyUsuario.getUserID() + "\n" +
                        "Usuario: " + MyUsuario.getUsuario() + "\n" +
                        "Contraseña: " + MyUsuario.getPassword());
                
                //Menu de usuario
                int opcionUser = 0;
        
                while (opcionUser != 7) {
        
                    opcionUser = Integer.parseInt(JOptionPane.showInputDialog(
                            "Menu de Usuario\n"
                            + "1. Solicitar libro\n"
                            + "2. Devolver libro\n"
                            + "3. Buscar libro\n"
                            + "4. Solicitar Soporte Tecnico\n"
                            + "5. Cambiar datos de usuario\n"
                            + "6. Mostrar mis datos\n"
                            + "7. Salir"));
        
                    if (opcionUser == 1) { //Solicitar libro
                        MyUsuario.solicitarLibro(); 
                    } else if (opcionUser == 2) { //Devolver libro
                        MyUsuario.devolverLibro(); 
                    } else if (opcionUser == 3) { //Buscar libro
                        MyUsuario.buscarLibro(); 
                    } else if (opcionUser == 4) { //Solicitar soporte tecnico
                        MyUsuario.solicitarSoporte(); 
                    } else if (opcionUser == 5) { //Cambiar datos de usuario

                        //Menu de cambio de datos
                        int opcionCambiar = 0;

                        if (opcionCambiar != 5) {
                            opcionCambiar = Integer.parseInt(JOptionPane.
                                    showInputDialog("Menu de Cambio de Datos\n"
                                            + "1. Cambiar nombre\n"
                                            + "2. Cambiar apellido\n"
                                            + "3. Cambiar nombre de usuario\n"
                                            + "4. Cambiar contraseña\n"
                                            + "5. Salir"));
                            if (opcionCambiar == 1) {
                                String nuevoNombre = JOptionPane.showInputDialog(
                                        "Ingrese su nuevo nombre:");
                                MyUsuario.setNombre(nuevoNombre);
                                JOptionPane.showMessageDialog(null, "Nombre "
                                        + "cambiado con éxito");
                            } else if (opcionCambiar == 2) {
                                String nuevoApellido = JOptionPane.showInputDialog(
                                        "Ingrese su nuevo apellido:");
                                MyUsuario.setApellido(nuevoApellido);
                                JOptionPane.showMessageDialog(null, "Apellido "
                                        + "cambiado con éxito");
                            } else if (opcionCambiar == 3) {
                                String nuevoUsuario = JOptionPane.showInputDialog(
                                        "Ingrese su nuevo usuario:");
                                MyUsuario.setUsuario(nuevoUsuario);
                                JOptionPane.showMessageDialog(null, "Nombre de"
                                        + " usuario cambiado con éxito");
                            } else if (opcionCambiar == 4) {
                                String nuevoPassword = JOptionPane.showInputDialog(
                                        "Ingrese su nueva contraseña:");
                                MyUsuario.setPassword(nuevoPassword);
                                JOptionPane.showMessageDialog(null, "Contraseña "
                                        + "cambiada con éxito");
                            } else if (opcionCambiar == 5) {
                                JOptionPane.showMessageDialog(null, "Saliendo "
                                        + "del menu de cambio de datos");
                            } else {
                                JOptionPane.showMessageDialog(null, "Opcion "
                                        + "invalida");
                            }
                        }
        
                    } else if (opcionUser == 6) { //Mostrar datos de usuario
                        JOptionPane.showMessageDialog(null, "Nombre: "
                                + MyUsuario.getNombre() + "\n"
                                + "Apellido: " + MyUsuario.getApellido() + "\n"
                                + "ID: " + MyUsuario.getUserID() + "\n"
                                + "Usuario: " + MyUsuario.getUsuario() + "\n"
                                + "Contraseña: " + MyUsuario.getPassword());

                    } else if (opcionUser == 7) { //Salir
                        JOptionPane.showMessageDialog(null, "Gracias por "
                                + "usar el menu de usuario");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
        
                }
                
            
            //Libro
            } else if (opcionMenu == 4) {
                //Codigo de clase y objeto Libro
                String autor = JOptionPane.showInputDialog(null, "Ingrese "
                        + "el nombre del autor del libro: ");
                String titulo = JOptionPane.showInputDialog(null, "Ingrese "
                        + "el titulo del libro: ");
                String genero = JOptionPane.showInputDialog(null, "Ingrese "
                        + "el genero del libro: ");
                String IDlibro = JOptionPane.showInputDialog(null, "Ingrese "
                        + "el ID del libro");
                String Disponibilidad = JOptionPane.showInputDialog(null,
                        "Digite Disponible, si el libro esta disponible para "
                                + "alquilar o \n"
                                + "Digite no dispoinible, si el libro no esta "
                                + "disponible para alquilar");
        
                libro mylibro = new libro(autor, titulo, genero,
                        IDlibro, Disponibilidad);
                
                JOptionPane.showMessageDialog(null, "El libro tiene la condicion"
                        + " de: " + mylibro.getDisponibilidad());

            } else if (opcionMenu == 5) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el "
                        + "programa");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
    
}
