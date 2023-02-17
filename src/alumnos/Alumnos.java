package alumnos;

import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sumaDeMedias = 0;
        Alumno[] alumnos = new Alumno[5];

        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        pedirDatos(alumnos, entrada); //Creamos una funcion para los datos de cada alumnos
        
        System.out.println("Los datos introducidos son los siguientes:");

        sumaDeMedias = muestraDatos(alumnos, sumaDeMedias); //Creamos una funcion para las notas de cada alumno

        System.out.println("La media global de la clase es " + sumaDeMedias / 5); //Mostramos la media final de todos los alumnos
    }

    /**
     * Mostramos al alumno correspondiente con su nota media
     * @param alumnos Este parametro es el objeto alumno
     * @param sumaDeMedias Este parametro es la suma de las medias de cada alumno
     * @return 
     */
    public static double muestraDatos(Alumno[] alumnos, double sumaDeMedias) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alumnos[i].getNombre());
            System.out.println("Nota media: " + alumnos[i].getNota());
            System.out.println("----------------------------");

            sumaDeMedias += alumnos[i].getNota();
        }
        return sumaDeMedias;
    }

    /**
     * Pedimos los datos de cada alumno
     * @param alumnos Este parametro es el objeto alumno
     * @param entrada Este parametro es el escaner
     * @throws NumberFormatException 
     */
    public static void pedirDatos(Alumno[] alumnos, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;
        for (int i = 0; i < 5; i++) {
            Alumno alumno = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            (alumnos[i]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alumnos[i].setNota(notaIntroducida);
        }
    }
}
