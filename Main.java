/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculo;

/**
 *
 * @author Rocio Lopez
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes vehículos
        Vehiculo automovil = new Automovil("Automóvil Toyota", 5);
        Vehiculo bicicleta = new Bicicleta("Bicicleta de montaña");

        // Acelerar y frenar los vehículos
        automovil.acelerar(60);
        automovil.frenar();

        bicicleta.acelerar(20);
        bicicleta.frenar();
    }
}
