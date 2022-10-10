/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class empleado {
    private String Nombre = JOptionPane.showInputDialog("Ingrese "
            + "su nombre:");
    private String Apellido = JOptionPane.showInputDialog("Ingrese "
            + "su apellido:");
    private String IDempleado = JOptionPane.showInputDialog("Ingrese "
            + "su ID de empleado:");
    private String cedula = JOptionPane.showInputDialog("Ingrese "
            + "su cedula:");
    private String correo = JOptionPane.showInputDialog("Ingrese "
            + "su correo:");
    private String telefono = JOptionPane.showInputDialog("Ingrese "
            + "su telefono:");
 


    public empleado(String Nombre, String Apellido, String IDempleado, String cedula,
            String correo, String telefono) {

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.IDempleado = IDempleado;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void NuevoPrestamo(){
        String prestamo = JOptionPane.showInputDialog("Ingrese el nuevo "
                + "prestamos en el siguiente orden: usuario(apellido,nombre, "
                + "IDusuario) y libro (Autor, titulo, ID libro y disponibilidad)");
            
        JOptionPane.showMessageDialog(null,"Nuevo prestamo "
                + "registrado"+ prestamo);
    }

    public void AñadirLibro(){
        //libro.mylibro;

    }
    
    public void VerInventario(){
    JOptionPane.showMessageDialog("El autor es"+mylibro.getautor());
    JOptionPane.showMessageDialog("El título es"+mylibro.gettítulo());
    JOptionPane.showMessageDialog("El genero es"+mylibro.getgenero());
    JOptionPane.showMessageDialog("El ID del libro es"+mylibro.getIDlibro());
    JOptionPane.showMessageDialog("La disponibilidad es"+mylibro.
            getdisponibilidad());
    
    }
}

