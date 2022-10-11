/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author LeonardoCZ
 */
public class biblioteca {
    private String sede;
    private String numerotelefonico;
    private String horario;
    private String IDbiblioteca;
    private String inventarioLibros;
    private String historial;
    
    public biblioteca(String Sede, String Numerotelefonico, String Horario, 
            String IDBiblioteca, String InventarioLibros , String Historial){
        this.sede = Sede;
        this.numerotelefonico = Numerotelefonico;
        this.horario = Horario;
        this.IDbiblioteca = IDBiblioteca;
        this.inventarioLibros = InventarioLibros;
        this.historial = Historial;
    }
    
    public String getSede(){
        return sede;
    }
    
    public String getNumerotelefonico(){
        return numerotelefonico;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public String getIDBiblioteca(){
        return IDbiblioteca;
    }
    
    public String getInventarioLibros(){
        return inventarioLibros;
    }
    
    public String getHistorial(){
        return historial;
    }

    
    
    
    
}

