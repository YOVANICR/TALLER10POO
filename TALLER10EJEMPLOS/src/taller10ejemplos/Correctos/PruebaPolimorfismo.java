/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado();

       
        Empleado gerente = new Gerente();

        // Llamar al método trabajar
        empleado.trabajar(); // Ejecuta el método de Empleado
        gerente.trabajar();  // Ejecuta el método sobrescrito en Gerente
    }
}
