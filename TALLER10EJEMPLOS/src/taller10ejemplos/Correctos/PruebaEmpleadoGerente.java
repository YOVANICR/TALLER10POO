/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10ejemplos.Correctos;

/**
 *
 * @author yoven
 */


public class PruebaEmpleadoGerente {
    public static void main(String[] args) {
       
        Empleado empleado = new Empleado();

       
        Gerente gerente = new Gerente();

        // Llamar al método trabajar desde ambos objetos
        empleado.trabajar(); // Muestra el trabajo general de un empleado
        gerente.trabajar(); // Muestra el trabajo especifico de un gerente
    }
}
