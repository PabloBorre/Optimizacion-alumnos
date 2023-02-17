package Alumno;

/**
 * Alumno.java Definición de la clase Alumno
 *
 * @author Pablo Borrego Lunaiz
 */
public class Alumno {

    
    
    private String nombre;
    private double nota;
    
    /*
    * Creamos el constructor
    */
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    
    /**
     * Devuelve el nombre del alumno
     * 
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe el nombre del alumno
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la nota del alumno
     * 
     * @return the notaMedia
     */
    public double getNota() {
        return nota;
    }

    /**
     * Recibe la nota del alumno
     * 
     * @param notaMedia the notaMedia to set
     */
    public void setNota(double notaMedia) {
        this.nota = notaMedia;
    }

    
    /*
    * Añadimos el toString para mostrarlo por pantalla
    */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
  
    

}
