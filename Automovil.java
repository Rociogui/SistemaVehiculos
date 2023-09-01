/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculo;

/**
 *
 * @author Rocio Lopez
 */
class Automovil extends Vehiculo {
    private int capacidadPasajeros;

    public Automovil(String nombre, int capacidadPasajeros) {
        super(nombre);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " está acelerando a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        System.out.println(getNombre() + " está frenando.");
    }
}

