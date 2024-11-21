/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10ejercicios.Numero1;

/**
 *
 * @author yoven
 */

public class PruebaPersona {
    public static void main(String[] args) {
        
        // Crear objetos de las tres clases
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); 
        Persona profesor = new Profesor();    

        // Llamar al método presentarse desde cada objeto
        persona.presentarse();       // Llama al método de Persona
        estudiante.presentarse();    // Llama al método sobrescrito en Estudiante
        profesor.presentarse();      // Llama al método sobrescrito en Profesor
    }
}
