/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

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
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opcion que desea:\n" +
                                                            "1. Biblioteca\n" +
                                                            "2. Empleado\n" +
                                                            "3. Usuario\n" +
                                                            "4. Libro\n" +
                                                            "5. Salir"));

            //Biblioteca
            if (opcionMenu == 1) {

                //Codigo de clase y objeto Biblioteca

            //Empleado
            } else if (opcionMenu == 2) {

                //Codigo de clase y objeto Empleado

            //Usuario
            } else if (opcionMenu == 3) {

                //Codigo de clase y objeto Usuario
            
            //Libro
            } else if (opcionMenu == 4) {

                //Codigo de clase y objeto Libro

            } else if (opcionMenu == 5) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
    
}
