/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author fanta
 */

public class libro {

    private String autor;
    private String titulo;
    private String genero;
    private String IDlibro;
    private String Disponibilidad;

    // Constructor de la clase
    public libro(String Autor, String Titulo, String Genero, String ID, String Disponibilidad) {
        this.autor = Autor;
        this.titulo = Titulo;
        this.genero = Genero;
        this.IDlibro = ID;
        this.Disponibilidad = Disponibilidad;
    }

    public libro mylibro = new libro(autor, titulo, genero, IDlibro, Disponibilidad);

    // Verificar disponibilidad

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getIDlibro() {
        return IDlibro;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }
    
}
