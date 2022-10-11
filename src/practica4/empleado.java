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
    private String Nombre;
    private String Apellido;
    private String IDempleado;
    private String cedula;
    private String correo;
    private String telefono;
 


    public empleado(String Nombre, String Apellido, String IDempleado, String cedula,
            String correo, String telefono) {

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.IDempleado = IDempleado;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    //Getter
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getIDempleado() {
        return IDempleado;
    }

    
    //Setter
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setIDempleado(String IDempleado) {
        this.IDempleado = IDempleado;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }
 
    public void SetCorreo(String correo ) {
        this.correo = correo;
    }

    public void SetTelefono(String telefono ) {
        this.telefono = telefono;
    }
    

    //Métodos
    
    public void NuevoPrestamo(){
        String prestamo = JOptionPane.showInputDialog("Ingrese el nuevo "
                + "prestamos en el siguiente orden: usuario(apellido,nombre, "
                + "IDusuario) y libro (Autor, titulo, ID libro y disponibilidad)");
            
        JOptionPane.showMessageDialog(null,"Nuevo prestamo "
                + "registrado"+ prestamo);
    }

    public void AñadirLibro(){
        String Libro=JOptionPane.showInputDialog("Ingrese el nuevo libro "
                + "con el siguiente orden: Autor, Titulo, Genero, IDLibro y "
                + "Disponibilidad");
        JOptionPane.showMessageDialog(null,"Nuevo libro registrado:"
                +Libro);
    }
    
    public void VerInventario(){
    JOptionPane.showMessageDialog(null,"La biblioteca tiene "
            + "cuenta con 120 libros en el inventario");
            
    }
}

