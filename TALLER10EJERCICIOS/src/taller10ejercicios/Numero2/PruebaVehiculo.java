/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10ejercicios.Numero2;

/**
 *
 * @author yoven
 */

public class PruebaVehiculo {
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta(); 

        // Llamar al método moverse desde cada objeto
        vehiculo.moverse();     // Llama al método de Vehiculo
        bicicleta.moverse();    // Llama al método sobrescrito en Bicicleta
    }
}
