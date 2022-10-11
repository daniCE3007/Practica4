/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

//Librerias
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class usuario {
    
    //Atributos
    private String nombre;
    private String apellido;
    private Integer userID;
    private String usuario;
    private String password;

    //Constructor
    public usuario(String nombre, String apellido, Integer userID, 
            String usuario, String password) {
        //Inicializar atributos
        this.nombre = nombre;
        this.apellido = apellido;
        this.userID = userID;
        this.usuario = usuario;
        this.password = password;
    }

    //Metodos GET
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    //Metodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Metodos de la clase
    public void solicitarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo "
                + "del libro que desea reservar:");
        JOptionPane.showMessageDialog(null, "Reservando el libro: " + titulo
                + "...");
        JOptionPane.showMessageDialog(null, nombre + " " + apellido +
                ", su solucitud del libro fue realizada con exito\n"
                + "Un administrador la revisara en breve");
    }

    public void devolverLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo "
                + "del libro que desea devolver:");
        JOptionPane.showMessageDialog(null, nombre + " " + apellido + 
                ", el libro " + titulo + " ha sido devuelto con exito");
    }
    
    public void buscarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del "
                + "libro que desea buscar:");
        JOptionPane.showMessageDialog(null, "Buscando el libro: " 
                + titulo + "...");
        JOptionPane.showMessageDialog(null, nombre + " " + apellido + 
                ", el libro " + titulo + " se encuentra disponible");
    }

    public void solicitarSoporte() {
        JOptionPane.showMessageDialog(null, nombre + " " + apellido +
                ", solucitud del soporte realizada con exito\n"
                + "Un agente se comunicara con usted en breve");
    }

}
