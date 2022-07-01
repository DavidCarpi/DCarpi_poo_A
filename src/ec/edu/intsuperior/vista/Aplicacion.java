package ec.edu.intsuperior.vista;

import java.util.Scanner;
import ec.edu.intsuperior.modelo.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
Persona p1 = new Persona();
Persona p2 = new Persona();
Persona p3 = new Persona();
        System.out.println("Ingrese la cedula de la Persona 1: ");
        p1.setId(leer.next());
        System.out.println("Ingrese el Nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el Apellido: ");
        p1.setApellido(leer.next());
        System.out.println("Ingrese su Direccion: ");
        p1.setDireccion(leer.next());
        p1.setGenero(Persona.TipoGenero.FEMENINO);
       
       
        System.out.println("El numero de Cedula es: " + p1.getId());
        System.out.println("Su Nombre y Apellido es:" +p1.getNombre() +p1.getApellido());
        System.out.println("Su direccion: " + p1.getDireccion());
        System.out.println("Su genero: " + p1.getGenero());
        
        System.out.println("Ingrese la cedula de la persona 2: ");
        p2.setId(leer.next());
        System.out.println("Ingrese el Nombre: ");
        p2.setNombre(leer.next());
        System.out.println("Ingrese el Apellido: ");
        p2.setApellido(leer.next());
        System.out.println("Ingrese su Direccion: ");
        p2.setDireccion(leer.next());
        p2.setGenero(Persona.TipoGenero.MASCULINO);
        
        System.out.println("El numero de Cedula es: " + p2.getId());
        System.out.println("Su Nombre y Apellido es:" +p2.getNombre() +p2.getApellido());
        System.out.println("Su direccion: " + p2.getDireccion());
        System.out.println("Su genero: " + p2.getGenero());
    }
}